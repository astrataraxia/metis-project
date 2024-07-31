package com.manage.metisuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MetisUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetisUserServiceApplication.class, args);
    }

}
