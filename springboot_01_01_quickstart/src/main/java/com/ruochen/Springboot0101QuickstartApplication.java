package com.ruochen;

import com.ruochen.Controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot0101QuickstartApplication.class, args);
        BookController bean = applicationContext.getBean(BookController.class);
        System.out.println("bean => " + bean);
    }

}
