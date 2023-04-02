package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Phone;

public interface PhoneDao extends JpaRepository <Phone, Long> {
    
}
