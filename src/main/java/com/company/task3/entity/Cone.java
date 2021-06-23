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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cone cone = (Cone) o;

        if (coneId != cone.coneId) return false;
        if (Double.compare(cone.radius, radius) != 0) return false;
        if (Double.compare(cone.height, height) != 0) return false;
        return base != null ? base.equals(cone.base) : cone.base == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = base != null ? base.hashCode() : 0;
        result = 31 * result + (int) (coneId ^ (coneId >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone{");
        sb.append("base=").append(base);
        sb.append(", coneId=").append(coneId);
        sb.append(", radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}
