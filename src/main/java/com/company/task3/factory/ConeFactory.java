package com.company.task3.factory;

import com.company.task3.entity.Cone;
import com.company.task3.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class ConeFactory {

    public Cone createShape(Point point, double radius, double height) {
        return new Cone(point, radius, height);
    }

    public Cone createShape(double x, double y, double z, double radius, double height) {
        Point point = new Point(x, y, z);
        return new Cone(point, radius, height);
    }

    public List<Cone> createShapeList(double[]... params) {

        return new ArrayList<>();
    }
}
