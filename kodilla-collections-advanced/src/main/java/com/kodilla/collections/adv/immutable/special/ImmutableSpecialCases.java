package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 1160;
        Integer b = 1160;
        Integer c = 110;
        Integer d = 110;

        System.out.println("Porownanie " + a + " == " + b + (a==b));
        System.out.println("Porownanie equals " + a.equals(b));
        System.out.println("Porownanie " + c + "== " + d + (c==d));
        System.out.println("Porownanie equals " + c.equals(d));

        String x = "This is nice string.";
        String y = "This is nice string.";

        System.out.println(x==y);
        System.out.println(x.equals(y));
        System.out.println("----------");

        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c==d);
        c += 10;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c==d);

        c = 1056;
        d = 1056;
        System.out.println(c.hashCode());
        System.out.println(d.hashCode());
        System.out.println(c==d);
    }
}
