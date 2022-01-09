package com.errorsys.jenkinsspringexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice
public class JenkinsSpringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringExampleApplication.class, args);
    }

    @GetMapping
    public String get(){
        return "yo yo master";
    }
}
