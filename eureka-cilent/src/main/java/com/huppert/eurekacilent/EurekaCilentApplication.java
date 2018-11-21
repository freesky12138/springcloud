package com.huppert.eurekacilent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableFeignClients(basePackages="com.huppert.eurekacilent")
@SpringBootApplication(scanBasePackages="com.huppert.eurekacilent")
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
public class EurekaCilentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCilentApplication.class, args);
    }
}
