package com.example.services;

import java.util.List;

import com.example.entities.Hobbie;

public interface HobbieService {

    public List <Hobbie> findAll();
    public Hobbie findbyId (long id); 
    public Hobbie save (Hobbie hobbie);
    public void delete (Hobbie hobbie); 
}
