package com.example.postcomment.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.postcomment.entities.Post;
import com.example.postcomment.repositories.PostRepository;
import com.example.postcomment.services.PostService;

import org.springframework.data.domain.Page;

@RestController
public class PostController {
@Autowired
private PostService postService;

@GetMapping("/posts")
public Page<Post> getAllPosts(Pageable pageable) {
    return postRepository.findAll(pageable);
}

@PostMapping("/posts")
public Post createPost(@Valid @RequestBody Post post) {
    return postRepository.save(post);
}
}
