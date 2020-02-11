package com.qiyemodu.springbootcacheredis.controller;

import com.qiyemodu.springbootcacheredis.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
public class TestRedisUtilController {

    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/redis/test")
    @ResponseBody
    public String test() {
        redisUtil.set("110", 119);
        return redisUtil.get("110").toString();
    }
}
