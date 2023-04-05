package com.example.services;

import java.util.List;

import com.example.entities.Post;

public interface PostService {

    public List<Post> findAll();
    public Post findbyId (long id); 
    public Post save (Post post);
    public void delete (Post post); 
}
