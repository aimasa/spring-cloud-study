package org.study.demo.stream.listener;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface TestTopic {

	/**
	 * 定义输入输出的名称
	 */
    String OUTPUT = "example-topic-output";
    String INPUT = "example-topic-input";

    /**
     * 输出
     */
    @Output(OUTPUT)
    MessageChannel output();

    /**
     * 输入
     */
    @Input(INPUT)
    SubscribableChannel input();

}
