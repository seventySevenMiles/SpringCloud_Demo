package com.example.consumer.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description：使用RestTemplate调用注册子模块接口方法
 */
@Service
public class ConsumerService {

    @Autowired
    private RestTemplate restTemplate;

    public String getName() {
        //调用子模块接口地址
        String name = restTemplate.getForObject("http://service-provider/test/getName", String.class);
        return name;
    }
}