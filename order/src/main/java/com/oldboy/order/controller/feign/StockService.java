package com.oldboy.order.controller.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service",path = "/stock")
public interface StockService {


    @RequestMapping("/remove")
    String remove();

}
