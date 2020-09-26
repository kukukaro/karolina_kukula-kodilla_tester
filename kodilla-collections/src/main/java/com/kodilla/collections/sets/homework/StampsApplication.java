package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("FatCat", 2.0, 1.5, true));
        stamps.add(new Stamp("BlackCat", 2.5, 1.4, true));
        stamps.add(new Stamp("Black&WhiteCat", 1.9, 1.4, false));
        stamps.add(new Stamp("WhiteCat", 2.0, 1.6, false));
        stamps.add(new Stamp("BlackCat", 2.5, 1.4, true));
        stamps.add(new Stamp("BlackCat", 2.5, 1.4, false));
        stamps.add(new Stamp("GingerCat", 2.5, 1.8, false));
        Stamp fatCatStamp = new Stamp("FatCat", 2.0, 1.5, true);
        stamps.add(fatCatStamp);
        stamps.add(fatCatStamp);

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
        System.out.println(stamps.size());
    }
}
