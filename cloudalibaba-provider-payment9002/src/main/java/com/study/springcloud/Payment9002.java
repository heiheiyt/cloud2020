package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author YT
 * @create 2020/12/8 8:58
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class Payment9002 {
    public static void main(String[] args){
        SpringApplication.run(Payment9002.class,args);
    }
}
