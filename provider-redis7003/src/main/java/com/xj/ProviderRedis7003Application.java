package com.xj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCaching
public class ProviderRedis7003Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderRedis7003Application.class, args);
    }

}
