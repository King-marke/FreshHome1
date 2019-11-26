package com.xj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaService6001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService6001Application.class, args);
    }

}
