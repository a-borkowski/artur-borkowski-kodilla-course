package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double b;
    private double a;

    public Triangle(double b, double a) {
        this.b = b;
        this.a = a;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return (a*b)/2;
    }
}
