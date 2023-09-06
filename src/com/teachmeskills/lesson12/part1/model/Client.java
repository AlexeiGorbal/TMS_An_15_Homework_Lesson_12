package com.teachmeskills.lesson12.part1.model;

import java.util.ArrayList;

public class Client {
    private String registrationDate;
    private String name;
    private int age;
    private Order basket;

    public Client(String registrationDate, String name, int age) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
    }

    public void setBasket(Order basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "registrationDate='" + registrationDate + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basket=" + basket +
                '}';
    }
}

