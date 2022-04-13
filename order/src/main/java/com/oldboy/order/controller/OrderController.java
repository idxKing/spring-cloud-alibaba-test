package com.oldboy.order.controller;

import com.oldboy.order.controller.feign.ProductService;
import com.oldboy.order.controller.feign.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    StockService stockService;

    @Autowired
    ProductService productService;

    @GetMapping("/getOrder")
    public String orderController() {

//        String stock = restTemplate.getForObject("http://stock-service/stock/remove", String.class);

        String remove = stockService.remove();
        String addProduct = productService.addProduct();

        return "order---" + remove + "-----" + addProduct;
    }
}
