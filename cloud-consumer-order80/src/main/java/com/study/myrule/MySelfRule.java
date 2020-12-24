package com.study.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author YT
 * @create 2020/11/11 15:47
 **/

@Configuration
public class MySelfRule {
    @Bean
    public IRule myrule(){
        return new RandomRule();
    }
}

