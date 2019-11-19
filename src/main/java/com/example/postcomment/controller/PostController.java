package com.example.postcomment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.postcomment.dtos.PostDto;
import com.example.postcomment.entities.Post;
import com.example.postcomment.services.PostService;


@RestController
public class PostController {
	
	@Autowired
	private PostService postService;

	@GetMapping("/posts")
	public List<Post> getAllPosts() {
		return postService.getAllPostsFromService();
	}

	@PostMapping("/posts")
	public Post createPost(@Valid @RequestBody Post post) {
		return postService.createPostFromService(post);
	}
	
	@PostMapping("/dtopost")
	public Post createPostThroughDto( @RequestBody PostDto postDto) {
		return postService.createPostThroughDtoFromService(postDto);
	}
	
}
