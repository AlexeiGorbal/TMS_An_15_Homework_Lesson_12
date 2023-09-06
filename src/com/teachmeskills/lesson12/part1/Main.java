package com.teachmeskills.lesson12.part1;

import com.teachmeskills.lesson12.part1.Util.Utils;
import com.teachmeskills.lesson12.part1.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Utils.client1.setBasket(Utils.order1);
        Utils.client2.setBasket(Utils.order2);
        Utils.client3.setBasket(Utils.order3);
        Utils.client4.setBasket(Utils.order4);

        ArrayList<String> keys = new ArrayList<>() {
            {
                add("MK1234");
                add("MO7564");
                add("RS6666");
                add("MC4356");
            }
        };

        Map<String, Client> map = new HashMap<>();
        map.put(keys.get(0), Utils.client1);
        map.put(keys.get(1), Utils.client2);
        map.put(keys.get(2), Utils.client3);
        map.put(keys.get(3), Utils.client4);

        System.out.println(map);
        System.out.println("Start");

        //Outputs keys via map.Entry
        for (Map.Entry<String, Client> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }

        //Outputs keys through an iterator
//        Iterator<String> iterator = keys.iterator();

//        while (iterator.hasNext()) {
//            String i = iterator.next();
//            System.out.println(i);
//        }

        // Outputs the keys
//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }

        //EOutputs values
        for (Client order : map.values()) {
            System.out.println(order);
        }
    }
}
