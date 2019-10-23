package com.example.consumer.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @Author gyf
 * @Date 2019/10/23 22:52
 */
@FeignClient(name= "spring-cloud-producer")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);

}
