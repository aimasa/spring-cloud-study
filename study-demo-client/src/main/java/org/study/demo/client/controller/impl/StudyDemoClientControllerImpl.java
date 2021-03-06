package org.study.demo.client.controller.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.study.demo.client.controller.StudyDemoController;

@RestController
public class StudyDemoClientControllerImpl implements StudyDemoController{
    @Value("${server.port}")
    String port;
    /**
     * 输入地址返回"hi ${name} ,i am from port: ${server.port}
     */
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }
}
