package com.company.task3.factory;

import com.company.task3.entity.Cone;
import com.company.task3.entity.Point;
import com.company.task3.entity.Shape;

import java.util.ArrayList;
import java.util.List;

public class ConeFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return null;
    }

    /*@Override
    public Cone createShape() {
        return new Cone(Point p, double radius, double height);
    }*/
    public List<Cone> createShape(double[] ... params) {
        return new ArrayList<>();
    }
}
