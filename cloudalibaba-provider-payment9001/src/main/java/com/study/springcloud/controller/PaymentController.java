package com.study.springcloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author YT
 * @create 2020/11/10 16:33
 **/
@RestController
@RequestMapping("/payment")
@Slf4j
@Api(value = "nacos信息")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @ApiOperation(value = "get",notes = "nacos控制器信息")
    @GetMapping(value = "/nacos/{id}")
    public String paymentConsul(@ApiParam(name = "识别id",value = "String",required = true) @PathVariable("id")String id){
        return "nacos registry,serverPort: "+serverPort+"\t id"+ id;
    }

}
