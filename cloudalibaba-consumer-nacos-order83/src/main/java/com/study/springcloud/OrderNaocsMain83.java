package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YT
 * @create 2020/12/8 9:23
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class OrderNaocsMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNaocsMain83.class, args);
    }
}
