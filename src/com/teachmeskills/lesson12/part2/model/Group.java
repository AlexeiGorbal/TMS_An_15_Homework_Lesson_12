package com.teachmeskills.lesson12.part2.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class Group {
    public static void outputGroup() {
        Set<String> set = new LinkedHashSet<>() {
            {
                add("Andrew");
                add("Roma");
                add("Dovlet");
                add("Vlad");
                add("Dima");
                add("Alex");
                add("Tonya");
                add("Gleb");
                add("Andrey");
                add("Vladimir");
                add("Alex");
            }
        };

        System.out.println(set);
    }
}
