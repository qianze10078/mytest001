package com.example.mytest.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description CountController
 * @Author wb-qz810081@alibaba-inc.com
 * @Date 2021/12/12 18:02
 */
@RestController
public class CountController {


    @Resource
    StringRedisTemplate stringRedisTemplate;


    @GetMapping("/test1001")
    public String count() {
        System.out.println("hello jack!");
        Long increment = stringRedisTemplate.opsForValue().increment("count-people");
        return "有【" + increment + "】人，访问了这个页面";
    }


}
