package com.example.varenykycloud.service;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private void orderGenerator() throws InterruptedException {

        while (true) {
            Thread.sleep(1000);
            //add some amount of orders to Kafka
        }
    }

    
}
