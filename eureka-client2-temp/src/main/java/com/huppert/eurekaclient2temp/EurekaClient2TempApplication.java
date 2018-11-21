package com.huppert.eurekaclient2temp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClient2TempApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient2TempApplication.class, args);
    }
}
