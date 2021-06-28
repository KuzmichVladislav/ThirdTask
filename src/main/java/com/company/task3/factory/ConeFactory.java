package com.company.task3.factory;

import com.company.task3.entity.Cone;
import com.company.task3.entity.Point;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ConeFactory {

    static final Logger logger = LogManager.getLogger();

    public Cone createCone(Point base, double radius, double height) {
        return new Cone(base, radius, height);
    }

    public Cone createCone(double x, double y, double z, double radius, double height) {
        Point base = new Point(x, y, z);
        return new Cone(base, radius, height);
    }

    public Cone createCone(double[] params) {
        Point base = new Point(params[0], params[1], params[2]);
        Cone cone = new Cone(base, params[3], params[4]);
        return cone;
    }

    public List<Cone> createConeList(List<double[]> paramsList) {
        List<Cone> coneList = new ArrayList<>();
        for (double[] p : paramsList) {
            Point base = new Point(p[0], p[1], p[2]);
            Cone cone = new Cone(base, p[3], p[4]);
            coneList.add(cone);
        }
        return coneList;
    }
}
