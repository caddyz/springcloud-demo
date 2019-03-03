package com.kaiser.eurekaconsumer.web;

import com.kaiser.eurekaconsumer.config.HomeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author Kaiser
 * @Date 2019/3/3 15:39
 * @Version 1.0
 **/
@RestController
public class TestController {
    @Autowired
    private HomeClient homeClient;

    @GetMapping("/test")
    public String demo(@RequestParam String name){
        return homeClient.he(name);
    }
}
