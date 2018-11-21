package com.huppert.eurekacilent2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class EurekaCilent2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCilent2Application.class, args);
    }
}
