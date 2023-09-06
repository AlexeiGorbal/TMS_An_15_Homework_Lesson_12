package com.teachmeskills.lesson12.part1.Util;

import com.teachmeskills.lesson12.part1.model.Client;
import com.teachmeskills.lesson12.part1.model.Order;

/**
 * Creates objects of class Order and Client
 */

public class Utils {
    public static Client client1 = new Client("05.09.2023", "Name1", 18);
    public static Client client2 = new Client("12.12.2022", "Name2", 20);
    public static Client client3 = new Client("23.06.2022", "Name3", 28);
    public static Client client4 = new Client("11.09.2020", "Name4", 32);

    public static Order order1 = new Order(15.40, "description1", "1234-34-45");
    public static Order order2 = new Order(112.45, "description2", "5432-32-76");
    public static Order order3 = new Order(748.54, "description3", "1238-85-23");
    public static Order order4 = new Order(89.12, "description4", "5849-21-53");
}
