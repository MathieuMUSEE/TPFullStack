package com.example.demo.dto;

import lombok.Data;

@Data
public class PostsCreateDto {

    private String posts;
    private String comment;
    private Long commentId;

}
