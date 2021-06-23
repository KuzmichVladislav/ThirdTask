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

    public Cone createShape(double[] params) {
        Point base = new Point(params[0], params[1], params[2]);
        Cone cone = new Cone(base, params[3], params[4]);
        return cone;
    }

    public List<Cone> createShapeList(List<double[]> paramsList) {
        List<Cone> coneList = new ArrayList<>();
        for (double[] p : paramsList) {
            coneList.add(createShape(p));
        }
        return new ArrayList<>();
    }


}
