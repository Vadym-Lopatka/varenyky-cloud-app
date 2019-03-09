package com.example.varenykycloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import static com.example.varenykycloud.service.OrderService.TOPIC_NAME;

@Component
public class KitchenService {
    private final Logger log = LoggerFactory.getLogger(KitchenService.class);

    @KafkaListener(topics = TOPIC_NAME, groupId = "orders")
    public void kitchenOrderHandler1(String orderId, Message<String> message) throws InterruptedException {
        log.info("order_listener_1_>>: {}", orderId);
        Thread.sleep(5*1000);
    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "orders2")
    public void kitchenOrderHandler2(String orderId, Message<String> message) throws InterruptedException {
        log.info("order_listener_2_>>: {}", orderId);
        Thread.sleep(5*1000);

    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "orders3")
    public void kitchenOrderHandler3(String orderId, Message<String> message) throws InterruptedException {
        log.info("order_listener_3_>>: {}", orderId);
        Thread.sleep(5*1000);

    }

    @KafkaListener(topics = TOPIC_NAME, groupId = "orders4")
    public void kitchenOrderHandler4(String orderId, Message<String> message) throws InterruptedException {
        log.info("order_listener_4_>>: {}", orderId);

    }
}
