package com.oldboy.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients
public class OrderSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderSpringBootApplication.class,args);
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
//        RestTemplate build = restTemplateBuilder.build();
//        return build;
//    }

}
