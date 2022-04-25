package com.oldboy.order.controller.feign;

import com.oldboy.common.WebCommon;
import com.oldboy.order.config.OpenFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = WebCommon.Product,path = "/product",configuration = OpenFeignConfig.class)
public interface ProductService {

    @GetMapping("/addProduct")
    String addProduct();

}
