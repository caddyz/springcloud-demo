package com.kaiser.eurekaconsumerhystrix.web;

import com.kaiser.eurekaconsumerhystrix.config.HomeRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HomeRemote homeRemote;

    @GetMapping("/test")
    public String hystrixTest(@RequestParam String name){
        return homeRemote.hystrixTest(name);
    }
}
