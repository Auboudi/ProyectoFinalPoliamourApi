package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.PhoneDao;
import com.example.entities.Phone;

@Service
public class PhoneServiceImpl implements PhoneService {
    
    @Autowired
    private PhoneDao phoneDao;

    @Override
    public List<Phone> findAll() {
        return phoneDao.findAll();
    }

    @Override
    public Phone findbyId(long id) {
        return phoneDao.findById(id).get();
    }

    @Override
    public Phone save(Phone phone) {
        return phoneDao.save(phone);
    }

    @Override
    public void delete(Phone phone) {
        phoneDao.delete(phone);
    }

}
