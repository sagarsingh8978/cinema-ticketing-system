package com.cinema.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        System.out.print("Starting gateway.=====.");
        SpringApplication.run(GatewayApplication.class, args);
    }
}