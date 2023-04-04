package com.example.services;

import java.util.List;

import com.example.entities.Phone;

public interface PhoneService {

    public List <Phone> findAll();
    public Phone findbyId (long id); 
    public Phone save (Phone phone);
    public void delete (Phone phone); 
    
}
