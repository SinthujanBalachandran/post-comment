//package com.example.postcomment.entities;
//
//import javax.persistence.*;
//
//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//@Table(name="comment")
//public class Comment {
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long id;
//
//private String text;
//
//@ManyToOne(fetch = FetchType.LAZY, optional = false)
//@JoinColumn(name="post_id",nullable=false)
//@OnDelete(action = OnDeleteAction.CASCADE)
//@JsonIgnore
//private Post post;
//
//public Long getId() {
//	return id;
//}
//
//public void setId(Long id) {
//	this.id = id;
//}
//
//public String getText() {
//	return text;
//}
//
//public void setText(String text) {
//	this.text = text;
//}
//
//public Post getPost() {
//	return post;
//}
//
//public void setPost(Post post) {
//	this.post = post;
//}
//
//}
