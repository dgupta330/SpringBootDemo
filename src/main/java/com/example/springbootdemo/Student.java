package com.example.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Student {
    int roll;
    String name;

    @Autowired
   //@Qualifier("math")
    Subjects hindi;
    Student(){
        System.out.println("Object Created...");
    }
    void disp(){
        System.out.println("Hi Everyone!!!");
        System.out.println("I opt for "+hindi.getName());
    }
}
