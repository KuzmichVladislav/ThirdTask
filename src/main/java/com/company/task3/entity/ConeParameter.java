package com.company.task3.entity;

public class ConeParameter {

    private final double shapeVolume;
    private final double surfaceArea;
    private final double generatrixLength;

    public ConeParameter(double shapeVolume, double surfaceArea, double generatrixLength) {
        this.shapeVolume = shapeVolume;
        this.surfaceArea = surfaceArea;
        this.generatrixLength = generatrixLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ConeParameter that = (ConeParameter) o;

        if (Double.compare(that.shapeVolume, shapeVolume) != 0) {
            return false;
        }
        if (Double.compare(that.surfaceArea, surfaceArea) != 0) {
            return false;
        }
        return Double.compare(that.generatrixLength, generatrixLength) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(shapeVolume);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(surfaceArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(generatrixLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConeParameters{");
        sb.append("shapeVolume=").append(shapeVolume);
        sb.append(", surfaceArea=").append(surfaceArea);
        sb.append(", generatrixLength=").append(generatrixLength);
        sb.append('}');
        return sb.toString();
    }
}
