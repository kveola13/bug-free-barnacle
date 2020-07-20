package com.kveola13.springbootmasterclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootMasterclassApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringbootMasterclassApplication.class, args);
        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

}
