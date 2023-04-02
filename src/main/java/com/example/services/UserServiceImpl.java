package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.dao.UserDao;
import com.example.entities.User;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userDao.findAll(pageable);
    }

    @Override
    public List<User> findAll(Sort sort) {
    return userDao.findAll(sort);    
    }

    @Override
    public User findbyId(long id) {
        return userDao.findById(id);
    }

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void deletebyId(long id) {
        userDao.deleteById(id);
    }

}
