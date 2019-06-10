package org.study.demo.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.study.demo.stream.listener.TestTopic;

@RestController
public class TestController {

    @Autowired
    private TestTopic testTopic;

    /**
     * 消息生产接口
     *
     * @param message 需要传送的消息
     * @return ok字符串
     */
    @GetMapping("/sendMessage")
    public String messageWithMQ(@RequestParam String message) {
        testTopic.output().send(MessageBuilder.withPayload(message).setHeader("version", "1.0").build());
        testTopic.output().send(MessageBuilder.withPayload(message).setHeader("version", "2.0").build());
        return "ok";
    }

}