package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.consumer.service.ConsumerService;

/**
 * @Description：消费端控制器
 */
@RequestMapping("consumer")
@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    /**
     * 方式一：RestTemplate调用
     */
    @RequestMapping("getName")
    public String getName() {
        return consumerService.getName();
    }
}