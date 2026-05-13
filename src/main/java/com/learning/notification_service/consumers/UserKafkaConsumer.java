package com.learning.notification_service.consumers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserKafkaConsumer {

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopicConsumer1(String message){
        log.info("Message Received to Consumer-1: {}", message);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopicConsumer2(String message){
        log.info("Message Received to Consumer-2: {}", message);
    }
}
