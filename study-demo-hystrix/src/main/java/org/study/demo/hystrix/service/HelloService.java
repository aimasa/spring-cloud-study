package org.study.demo.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	  @Autowired
	    RestTemplate restTemplate;

	  /**
	   * 访问这个地址http://STUDT-DEMO-CLIENT/hi?name=${name}，如果报错，则启用熔断机制
	   * @param name 需要输出的name值
	   * @return http://STUDT-DEMO-CLIENT/hi?name=${name}的访问结果
	   */
	    public String hiService(String name) {
	        return restTemplate.getForObject("http://STUDT-DEMO-CLIENT/hi?name="+name,String.class);
	    }
}
