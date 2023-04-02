package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Department;

public interface DepartamentoDao extends JpaRepository<Department, Long>   {
    
    
}
