package com.study.springcloud.controller;

import com.study.springcloud.entities.CommonResult;
import com.study.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author YT
 * @create 2020/11/11 8:41
 **/

@RestController
@RequestMapping("/consumer/payment")
public class OrderConsulController {

    private static final String INVOME_URL="http://consul-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consul")
    public String getPaymentById(){
       return  restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
    }
}
