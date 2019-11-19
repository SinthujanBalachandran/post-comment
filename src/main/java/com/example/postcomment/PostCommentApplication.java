package com.example.postcomment;

import javax.persistence.EntityListeners;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PostCommentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostCommentApplication.class, args);
	}

}
