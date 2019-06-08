package org.study.demo.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.web.bind.annotation.RestController;
import org.study.demo.stream.listener.TestTopic;

/**
 * Hello world!
 *
 */
@EnableBinding(TestTopic.class)
@SpringBootApplication
public class App 
{
	  public static void main(String[] args) {
	        SpringApplication.run(App.class, args);
	    }






}