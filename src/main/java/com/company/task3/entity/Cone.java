package com.company.task3.entity;


public class Cone extends Shape {
    private Point base;
    private long coneId;
    private double radius;
    private double height;


    public Cone(Point base, double radius, double height) {
        this.base = base;
        this.radius = radius;
        this.height = height;
    }

    public Point getBase() {
        return base;
    }

    public void setBase(Point base) {
        this.base = base;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
