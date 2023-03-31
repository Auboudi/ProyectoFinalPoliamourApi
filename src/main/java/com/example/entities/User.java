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

    @NotEmpty(message = "El correo no puede estar vacío")
    @Size(min = 4, max = 25, message = "El correo debe contener entre 4 y 25 caracteres")
    private String correo;

    @NotEmpty(message = "La contraseña no puede estar vacía")
    @Size(min = 6, max = 15, message = "La contraseña debe contener entre 6 y 15 caracteres")
    private String contraseña;


    
}
