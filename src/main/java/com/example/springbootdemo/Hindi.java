package com.example.springbootdemo;

import org.springframework.stereotype.Component;

@Component
public class Hindi implements Subjects{
    int code;
    String name;
    Hindi()
    {
        code=102;
        name="Hindi";
    }

    @Override
    public String getName() {
        return name;
    }
}
