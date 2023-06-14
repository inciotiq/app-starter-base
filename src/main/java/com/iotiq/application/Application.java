package com.iotiq.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.iotiq.application", "com.iotiq.user", "com.iotiq.commons"})
@EntityScan(basePackages = {"com.iotiq.application", "com.iotiq.user", "com.iotiq.commons"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
