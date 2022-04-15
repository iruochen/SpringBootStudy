package com.ruochen.controller;

import com.ruochen.MyDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
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

    // 将所有数据封装到一个对象中
    @Autowired
    private Environment environment;

    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getById() {
        System.out.println("springboot is running ....");
        System.out.println("country => " + country1);
        System.out.println("name1 => " + name1);
        System.out.println("likes1 => " + likes1);
        System.out.println("-----------------------");
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("country"));
        System.out.println("-----------------------");
        System.out.println(myDataSource);
        return "springboot is running ....";
    }
}
