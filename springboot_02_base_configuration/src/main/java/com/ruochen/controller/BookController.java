package com.ruochen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest 模式
@RestController
@RequestMapping("/books")
public class BookController {

    // 读取yaml数据中的单一数据
    @Value("${country}")
    private String country1;

    @Value("${user.name}")
    private String name1;

    @Value("${likes[1]}")
    private String likes1;

    @GetMapping
    public String getById() {
        System.out.println("springboot is running ....");
        System.out.println("country => " + country1);
        System.out.println("name1 => " + name1);
        System.out.println("likes1 => " + likes1);
        return "springboot is running ....";
    }
}
