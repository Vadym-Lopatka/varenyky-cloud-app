package com.example.varenykycloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

import static com.example.varenykycloud.service.OrderService.TOPIC_NAME;

@Component
public class KitchenService {
    private final Logger log = LoggerFactory.getLogger(KitchenService.class);

    @KafkaListener(topics = TOPIC_NAME, groupId = "orders")
    public void kitchenOrderHandler(String orderId, Message<String> message) {
        log.info("kitchen terminal got new orderId: {}", orderId);
    }
}
