package com.xj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class ConsumerService8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerService8001Application.class, args);
    }

}
