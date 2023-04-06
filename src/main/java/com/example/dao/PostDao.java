package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Post;

public interface PostDao extends JpaRepository<Post, Long> {
    
}
