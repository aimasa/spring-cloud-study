package org.study.demo.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 启动类，在注册中心进行注册
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
//@RestController
public class App
{
    public static void main( String[] args )
    {
    	SpringApplication.run( App.class, args );
    }


}
