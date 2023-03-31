package com.example.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "El campo <nombre> no puede estar vacío")
    @Size(min = 4, max = 25, message = "El nombre debe contener entre 4 y 25 caracteres")
    private String nombre;

    @NotEmpty(message = "El campo <apellidos> no puede estar vacío")
    @Size(min = 4, max = 25, message = "Los apellidos debe contener entre 4 y 25 caracteres")
    private String apellidos;

    @NotEmpty(message = "El campo <correo> no puede estar vacío")
    @Size(min = 4, max = 25, message = "El correo debe contener entre 4 y 25 caracteres")
    private String correo;

    @NotEmpty(message = "El campo <contraseña> no puede estar vacío")
    private String contraseña;

    @NotEmpty(message = "El campo <ciudad> no puede estar vacía")
    private String ciudad;


    
}
