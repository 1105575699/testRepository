package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //第一次修改111
        SpringApplication.run(DemoApplication.class, args);
    }


    public static void method(){
        Integer i = 3 ; 
        System.out.println(i);

    }
}
