package com.xj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//@EnableDiscoveryClient//可以用来开启其他注册中心
@EnableEurekaClient//只能开启urekae
@EnableCircuitBreaker
@SpringBootApplication
@MapperScan("com.xj.mapper")
public class ProviderService7002Application {

    public static void main(String[] args) {
        SpringApplication.run(ProviderService7002Application.class, args);
    }

}
