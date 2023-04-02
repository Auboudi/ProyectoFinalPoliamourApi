package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Phone;

public interface TelefonoDao extends JpaRepository <Phone, Long> {
    
}
