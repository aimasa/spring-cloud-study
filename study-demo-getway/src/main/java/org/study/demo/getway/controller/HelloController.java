package org.study.demo.getway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.study.demo.getway.service.HelloService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloController {
	   @Autowired
	    HelloService helloService;

	   @HystrixCommand(fallbackMethod = "hiError")
	    @GetMapping(value = "/hi")
	    public String hi(@RequestParam String name) {
	        return helloService.hiService( name );
	    }
	   
	   public String hiError(String name) {
	        return "hi,"+name+",sorry,error!";
	    }
}
