package com.kaiser.eurekaservicesingle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceSingleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceSingleApplication.class, args);
    }

}
