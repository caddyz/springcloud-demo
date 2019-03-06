package com.kaiser.eurekaconsumerhystrix.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-provider",fallback = HomeRemoteHystrix.class)
public interface HomeRemote {
    @GetMapping("/hello")
    String hystrixTest(@RequestParam String name);
}
