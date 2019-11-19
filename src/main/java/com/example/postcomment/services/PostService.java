package com.example.postcomment.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.postcomment.repositories.PostRepository;

public class PostService {

	
	@Autowired
	private PostRepository postRepository;
}
