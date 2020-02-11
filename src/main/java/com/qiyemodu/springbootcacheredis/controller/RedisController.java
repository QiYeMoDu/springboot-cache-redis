package com.qiyemodu.springbootcacheredis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@RestController
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/redis")
    public String testRedis() {
        redisTemplate.opsForValue().set("11", "12346");
        return redisTemplate.opsForValue().get("11").toString();
    }
}
