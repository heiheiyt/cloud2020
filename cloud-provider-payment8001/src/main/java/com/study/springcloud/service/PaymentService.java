package com.study.springcloud.service;

import com.study.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author YT
 * @create 2020/11/3 9:30
 **/
public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取

}
