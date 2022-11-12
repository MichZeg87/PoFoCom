package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Stemp1", 11, 2,true));
        stamps.add(new Stamp("Stemp2", 12, 3,false));
        stamps.add(new Stamp("Stemp3", 9, 4, false));
        stamps.add(new Stamp("Stemp3", 9, 4, false));
        stamps.add(new Stamp("Stemp1", 11, 2,true));
        stamps.add(new Stamp("Stemp2", 12, 3,false));

        System.out.println("The number of orders is " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
