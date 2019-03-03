package com.kaiser.eurekaprovider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Kaiser
 * @Date 2019/3/3 15:26
 * @Version 1.0
 **/
@RestController
public class TestController {
    @GetMapping("/hello")
    public String he(@RequestParam String name){
        return "Hello Spring Cloud "+name;
    }
}
