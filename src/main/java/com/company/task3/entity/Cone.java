package com.company.task3.entity;


import com.company.task3.util.IdGenerator;

public class Cone extends Shape {// implements Observable {
    private Point center;
    private double radius;
    private double height;
   // IdGenerator coneId = new IdGenerator();
    //  private ArrayList<Observer> observers = new ArrayList<>();

    public Cone(Point center, double radius, double height) {
        this.center = center;
        this.radius = radius;
        this.height = height;
       // coneId.generateId();

    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
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
