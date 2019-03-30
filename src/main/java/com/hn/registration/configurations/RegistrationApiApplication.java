package com.hn.registration.configurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@ComponentScan("com.hn")
@EnableSwagger2
@SpringBootApplication
@Configuration
public class RegistrationApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationApiApplication.class);
    }

    @Bean
    public Docket registrationApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.hn")).build();
    }

}
