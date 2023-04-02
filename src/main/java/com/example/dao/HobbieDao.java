package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Hobbie;

public interface HobbieDao extends JpaRepository<Hobbie, Long> {


    
}
