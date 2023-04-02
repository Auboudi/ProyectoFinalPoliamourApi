package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.User;

public interface UserDao extends JpaRepository<User, Long>  {


/*QUERYS DE BUSQUEDA/RECUPERACION DE USERS */

//QUERY DE BUSQUEDA PAGINADA DE USER POR DEPARTAMENTO

@Query(value = "select u from User u left join fetch u.department")
    public List<User> findAll(Sort sort); 

//QUERY DE BUSQUEDA PAGINADA DE USER POR YARD

@Query(value = "select u from User u left join fetch u.yards")
    public List<Producto> findAll(Sort sort); 
    
}
