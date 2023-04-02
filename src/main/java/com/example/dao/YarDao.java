package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Yard;

public interface YarDao extends JpaRepository<Yard, Long>   {
    
}
