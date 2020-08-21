package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Math implements Subjects{
    int code;
    String name;
    Math()
    {
        code=101;
        name="Math";
    }

    @Override
    public String getName() {
        return name;
    }
}
