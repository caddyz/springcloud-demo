package com.kaiser.eurekaconsumer.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HomeClient
 * @Description TODO
 * @Author Kaiser
 * @Date 2019/3/3 15:36
 * @Version 1.0
 **/
@FeignClient("eureka-provider")
public interface HomeClient {
    /**
     * 实现spring cloud 消费
     * @param name
     * @return
     */
    @GetMapping("/hello")
    String he(@RequestParam String name);
}
