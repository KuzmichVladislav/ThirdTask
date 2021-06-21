package com.company.task3.entity;

public class ConeParameters {

    private double shapeVolume;
    private double surfaceArea;

    public double getShapeVolume() {
        return shapeVolume;
    }

    public void setShapeVolume(double shapeVolume) {
        this.shapeVolume = shapeVolume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConeParameters)) return false;

        ConeParameters that = (ConeParameters) o;

        if (Double.compare(that.getShapeVolume(), getShapeVolume()) != 0) return false;
        return Double.compare(that.getSurfaceArea(), getSurfaceArea()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getShapeVolume());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSurfaceArea());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ConeParameters{" +
                "shapeVolume=" + shapeVolume +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}
