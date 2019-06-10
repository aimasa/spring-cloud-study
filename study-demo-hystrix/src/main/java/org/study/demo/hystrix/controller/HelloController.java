package org.study.demo.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.study.demo.hystrix.service.HelloService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloController {
	   @Autowired
	    HelloService helloService;

	   /**
	    * 传值name，返回http://STUDT-DEMO-CLIENT/hi?name=${name}这个地址的返回值
	    * @param name http://STUDT-DEMO-CLIENT/hi?name=${name}
	    * @return http://STUDT-DEMO-CLIENT/hi?name=${name}的返回值
	    */
	   @HystrixCommand(fallbackMethod = "hiError")
	    @GetMapping(value = "/hi")
	    public String hi(@RequestParam String name) {
	        return helloService.hiService( name );
	    }
	   /**
	    * 如果http://STUDT-DEMO-CLIENT/hi?name=${name}这个地址访问出错，则调用该方法
	    * @param name "hi,${name},sorry,error!"
	    * @return "hi,${name},sorry,error!"
	    */
	   
	   public String hiError(String name) {
	        return "hi,"+name+",sorry,error!";
	    }
}
