package com.manage.metisdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MetisDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetisDiscoveryServiceApplication.class, args);
    }

}
