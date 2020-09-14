package com.acornsoft.cocktaildemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CocktailDemoApplication extends SpringBootServletInitializer {

    @GetMapping
    public String test() {
        return "Greetings from Spring Boot!";
    }


    public static void main(String[] args) throws Exception {
        //SpringApplication.run(CocktailDemoApplication.class, args);

        SpringApplication application = new SpringApplicationBuilder()
                .sources(CocktailDemoApplication.class)
                .listeners(new ApplicationPidFileWriter("./application.pid"))
                .build();

        application.run(args);
    }

}

