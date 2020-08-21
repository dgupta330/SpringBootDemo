package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(SpringbootdemoApplication.class, args);
        Student deepak=context.getBean(Student.class);
        deepak.disp();



        //spring works like singleton prototype
        //it will create one object of all classes on which we mention @Component
        //no matters how many times we call context.getBase() it refers to same object.
        //to avoid singleton feature we have to mention @Scope (value="prototype")

        Student satyam=context.getBean(Student.class);
        satyam.disp();
    }

}
