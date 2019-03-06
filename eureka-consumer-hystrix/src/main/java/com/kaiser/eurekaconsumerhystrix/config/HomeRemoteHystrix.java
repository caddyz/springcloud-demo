package com.kaiser.eurekaconsumerhystrix.config;

import org.springframework.stereotype.Component;

@Component
public class HomeRemoteHystrix implements HomeRemote {
    @Override
    public String hystrixTest(String name) {
        return "Hello "+name+" this is hystrix page!";
    }
}
