package com.example.postcomment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postcomment.entities.Post;

@Repository
public interface PostRepository extends JpaRepository <Post,Long>{

}
