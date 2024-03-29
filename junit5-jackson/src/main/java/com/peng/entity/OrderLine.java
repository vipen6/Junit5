package com.peng.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @description: Author:Gnepx
 * @Date:2022-02-10 22:59
 */
public class OrderLine {
    private String item;
    private int quantity;
    private BigDecimal unitPrice;
    private LocalDate orderDate;
    // Constructors, Getters, Setters and toString


    public OrderLine() {
    }

    public OrderLine(String item, int quantity, BigDecimal unitPrice, LocalDate orderDate) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "item='" + item + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", orderDate=" + orderDate +
                '}';
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}
