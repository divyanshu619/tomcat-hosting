package com.example.host;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HostApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(HostApplication.class, args);
    }

}
