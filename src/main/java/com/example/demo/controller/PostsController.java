package com.example.demo.controller;

import com.example.demo.service.CommentsService;
import com.example.demo.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")

public class PostsController {

    @Autowired
    PostsService postsService;

    @Autowired
    CommentsService commentsService;




}
