package com.xj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.xj.mapper")
public class ProviderService7001Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderService7001Application.class, args);
    }

}
