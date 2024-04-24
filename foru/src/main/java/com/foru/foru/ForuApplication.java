package com.foru.foru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ForuApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForuApplication.class, args);
    }
}
