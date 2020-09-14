package com.acornsoft.cocktaildemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CocktailDemoApplication extends SpringBootServletInitializer {

    @GetMapping
    public String test() {
        return "Greetings from Spring Boot!";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(CocktailDemoApplication.class, args);
    }

}

