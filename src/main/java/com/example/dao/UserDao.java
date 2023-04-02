package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.User;

public interface UserDao extends JpaRepository<User, Long> {
     //Recupera lista de usuarios ordenados
     @Query(value = "select u from User u left join fetch u.department left join fetch u.hobbie left join fetch u.yard left join fetch u.phone")
     public List<User> findAll(Sort sort);


    //Recupera una pagina de usuarios
    @Query(value = "select u from User u left join fetch u.department left join fetch u.hobbie left join fetch u.yard left join fetch u.phone",
     countQuery = "select count(u) from User u left join fetch u.department left join fetch u.hobbie left join fetch u.yard left join fetch u.phone")
     public Page<User> findAll(Pageable pageable);


    //El metodo siguiente recupera el usuario por ID, para que nos traiga el resto de tablas

    @Query(value = "select u from User u left join fetch u.department left join fetch u.hobbie left join fetch u.yard left join fetch u.phone where p.id= :id")
    public User findById(long id);
    


}

    

