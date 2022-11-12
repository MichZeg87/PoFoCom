package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String name;
    private int dimensionA;
    private int dimensionB;
    private boolean stamped;

    public Stamp (String name, int dimensionA, int dimensionB, boolean stamped){
            this.name = name;
            this.dimensionA = dimensionA;
            this.dimensionB = dimensionB;
            this.stamped = stamped;
    }
    public String getName(){
            return name;
    }

    public int getDimensionA() {
        return dimensionA;
    }

    public int getDimensionB() {
            return dimensionB;
    }

    public boolean getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return dimensionA == stamp.dimensionA && dimensionB == stamp.dimensionB && stamped == stamp.stamped && Objects.equals(name, stamp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimensionA, dimensionB, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "name='" + name + '\'' +
                ", dimensionA=" + dimensionA +
                ", dimensionB=" + dimensionB +
                ", stamped=" + stamped +
                '}';
    }
}
