package com.geometrylibrary;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getArea() {
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }
}
