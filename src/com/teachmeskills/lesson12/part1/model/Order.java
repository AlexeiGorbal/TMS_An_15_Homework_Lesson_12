package com.teachmeskills.lesson12.part1.model;

public class Order {
    private double prise;
    private String description;
    private String orderNumber;

    public Order(double prise, String description, String orderNumber) {
        this.prise = prise;
        this.description = description;
        this.orderNumber = orderNumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "prise=" + prise +
                ", description='" + description + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                '}';
    }
}
