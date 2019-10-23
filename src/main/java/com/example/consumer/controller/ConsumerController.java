package com.example.consumer.controller;

import com.example.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @Author gyf
 * @Date 2019/10/23 22:51
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }

}