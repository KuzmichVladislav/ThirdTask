package com.company.task3.factory;

import com.company.task3.entity.Cone;
import com.company.task3.entity.Point;

import java.util.ArrayList;
import java.util.List;

public class ConeFactory {

    public Cone createShape(Point base, double radius, double height) {
        return new Cone(base, radius, height);
    }

    public Cone createShape(double x, double y, double z, double radius, double height) {
        Point base = new Point(x, y, z);
        return new Cone(base, radius, height);
    }

    public List<Cone> createShapeList(List<double[]> params) {
       List<Cone> coneList = new ArrayList<>();
        for (double[] p : params) {
            Point base = new Point(p[0], p[1], p[2]);
            Cone cone = new Cone(base, p[3], p[4]);
            coneList.add(cone);
        }
        return new ArrayList<>();
    }
}
