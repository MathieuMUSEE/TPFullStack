package com.example.demo.controller;

import com.example.demo.dto.PostsCreateDto;
import com.example.demo.entity.Posts;
import com.example.demo.service.CommentsService;
import com.example.demo.service.PostsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")

public class PostsController {

    @Autowired
    private ModelMapper modelMapper;

    Posts posts = new Posts();
    posts.setTitle("Salut a tous");
    posts.setComment("Comment ça va ?");

    PostsCreateDto postsCreateDto = modelMapper.map(posts, PostsCreateDto.class);

    @Autowired
    PostsService postsService;

    @Autowired
    CommentsService commentsService;




}
