package com.project.ccmserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;
@RestController
public class KafkaController {
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.topic.name}")
    String topicName;

    @PostMapping("/publish")
    public void connectApplication(@RequestBody String message) {

    }
}