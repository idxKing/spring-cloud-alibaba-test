package com.oldboy.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * openfeign配置类
 */
//@Configuration
public class OpenFeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }




}
