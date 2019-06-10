package org.study.demo.client.controller;


public interface StudyDemoController {
	/**
	 * 输入name返回"hi ${name} ,i am from port: ${server.port}"字符串
	 * @param name 
	 * @return "hi ${name} ,i am from port: ${server.port}"
	 */
    public String home(String name);
}
