package com.oldboy.stock.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/stock")
@RestController
public class StockController {

    @Value("${server.port}")
    public String port;


    @GetMapping("/remove")
    public String remove(){
        return "扣减库存"+port;
    }

}
