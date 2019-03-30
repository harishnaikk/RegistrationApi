package com.hn.registration.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.hn")
@SpringBootApplication
public class RegistrationApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationApiApplication.class);
    }

}
