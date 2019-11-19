package com.example.postcomment.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postcomment.dtos.PostDto;
import com.example.postcomment.entities.Post;
import com.example.postcomment.repositories.PostRepository;

@Service
public class PostService {

	
	@Autowired
	private PostRepository postRepository;

	public List<Post> getAllPostsFromService() {
		return postRepository.findAll();
	}

	public Post createPostFromService(@Valid Post post) {
		return postRepository.save(post);
	}

	public Post createPostThroughDtoFromService( PostDto postDto) {
		Post post = new Post();
		post.setTitle(postDto.getTitle());
		return postRepository.save(post) ;
	}
	
}
