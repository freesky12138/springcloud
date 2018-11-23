package com.huppert.eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul 的主要作用1：:将所有进入微服务都先到到zuul服务，再由zuul服务分发下去，就可以忽略各个服务的端口号，地址
 * 2：进行身份验证过滤
 * 3：进行日志信息收集
 *
 * ps:zuul 的效率不如nginx
 */

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }
}
