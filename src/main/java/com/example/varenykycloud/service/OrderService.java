package com.example.varenykycloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final Logger log = LoggerFactory.getLogger(OrderService.class);

    /**
     * Kafka topic name
     */
    public static final String TOPIC_NAME = "varenykyCloudOrdersTopic";

    private KafkaTemplate<String, String> kafkaTemplate;

    public OrderService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void orderGenerator() {

        for (int i = 0; i < 5; i++) {
            log.info("order_producer_>>: {}", i);
            kafkaTemplate.send(TOPIC_NAME, String.valueOf(i));
        }
    }


}
