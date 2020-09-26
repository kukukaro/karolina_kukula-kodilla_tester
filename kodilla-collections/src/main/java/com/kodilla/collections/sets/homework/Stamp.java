package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    String name;
    double height;
    double width;
    boolean stamped;

    public Stamp(String name, double height, double width, boolean stamped) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.stamped = stamped;
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", stamped=" + stamped +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                stamped == stamp.stamped &&
                Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, width, stamped);
    }
}
