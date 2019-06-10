package org.study.demo.stream.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;


import lombok.extern.slf4j.Slf4j;

/**
 * 消息消费逻辑
 */
@Slf4j
@Component
public class TestListener {
	
	private static Logger logger = LoggerFactory.getLogger(TestListener.class);

	/**
	 * 打印version==1.0的信息
	 * @param payload controller传进的参数
	 * @param version 对应的版本号
	 */
    @StreamListener(value = TestTopic.INPUT, condition = "headers['version']=='1.0'")
    public void receiveV1(String payload, @Header("version") String version) {
    	logger.info("Received v1 : " + payload + ", " + version);
    }

    /**
	 * 打印version==2.0的信息
	 * @param payload controller传进的参数
	 * @param version 对应的版本号
	 */
    @StreamListener(value = TestTopic.INPUT, condition = "headers['version']=='2.0'")
    public void receiveV2(String payload, @Header("version") String version) {
    	logger.info("Received v2 : " + payload + ", " + version);
    }

}
