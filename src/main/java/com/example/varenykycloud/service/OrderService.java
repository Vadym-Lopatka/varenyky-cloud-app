package com.example.varenykycloud.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class OrderService {
    public static final String TOPIC_NAME = "varenykyCloudOrdersTopic";
    private final Logger log = LoggerFactory.getLogger(OrderService.class);

    private KafkaTemplate<String, String> kafkaTemplate;

    public OrderService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void orderGenerator() throws InterruptedException {
        log.debug("New order from hungry man");

        Random random = new Random();
        long orderId = 1;

        for (int i = 0; i < 5; i++) {
            byte randomAmount = Byte.valueOf("" + random.nextInt(127));
            VarenykyOrderDTO varenykyOrderDTO = new VarenykyOrderDTO(orderId++, randomAmount);

            log.info("VarenykyOrder details: {}", varenykyOrderDTO);
            kafkaTemplate.send(TOPIC_NAME, String.valueOf(varenykyOrderDTO.getOrderId()));

        }
    }


}
