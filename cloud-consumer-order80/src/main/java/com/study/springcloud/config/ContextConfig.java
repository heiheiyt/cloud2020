package com.study.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author YT
 * @create 2020/11/4 9:43
 **/
@Configuration
public class ContextConfig {

    @Bean
    @LoadBalanced //使用@LoadBanlanced赋予restTemplate负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
