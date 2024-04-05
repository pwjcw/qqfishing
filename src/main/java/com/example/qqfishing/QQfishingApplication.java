package com.example.qqfishing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.qqfishing.mapper")
@SpringBootApplication
public class QQfishingApplication {

    public static void main(String[] args) {
        SpringApplication.run(QQfishingApplication.class, args);
    }

}
