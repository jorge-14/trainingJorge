package com.mc4.trainingjorge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mc4.commons.base", "com.mc4.trainingjorge"})
public class TrainingJorgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainingJorgeApplication.class, args);
    }

}
