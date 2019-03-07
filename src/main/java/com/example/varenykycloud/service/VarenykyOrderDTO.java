package com.example.varenykycloud.service;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

//@Data
//@AllArgsConstructor
public class VarenykyOrderDTO implements Serializable {
    private Long orderId;
    private Byte amount;

    public VarenykyOrderDTO() {
    }

    public VarenykyOrderDTO(Long orderId, Byte amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Byte getAmount() {
        return amount;
    }

    public void setAmount(Byte amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "VarenykyOrderDTO{" +
                "orderId=" + orderId +
                ", amount=" + amount +
                '}';
    }
}
