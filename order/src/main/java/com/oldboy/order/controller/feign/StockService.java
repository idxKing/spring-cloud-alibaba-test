package com.oldboy.order.controller.feign;

import com.oldboy.common.WebCommon;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = WebCommon.Stock,path = "/stock")
public interface StockService {


    @RequestMapping("/remove")
    String remove();

}
