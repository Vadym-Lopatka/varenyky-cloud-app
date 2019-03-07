package com.example.varenykycloud.rest;

import com.example.varenykycloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class RestOrderController {

    private OrderService orderService;

    public RestOrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(path = "/new-hungry-man")
    public void startServeNewHungryMan() throws InterruptedException {
        orderService.orderGenerator();
    }
}
