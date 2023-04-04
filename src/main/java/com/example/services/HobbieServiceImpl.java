package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.HobbieDao;
import com.example.entities.Hobbie;

@Service
public class HobbieServiceImpl implements HobbieService {

    @Autowired
    private HobbieDao hobbieDao;

    @Override
    public List<Hobbie> findAll() {
        return hobbieDao.findAll();
    }

    @Override
    public Hobbie findbyId(long id) {
        return hobbieDao.findById(id).get();
    }

    @Override
    public Hobbie save(Hobbie hobbie) {
        return hobbieDao.save(hobbie);
    }

    @Override
    public void delete(Hobbie hobbie) {
        hobbieDao.delete(hobbie);
    }
    
}
