package com.company.task3.repository.impl;

import com.company.task3.entity.Cone;
import com.company.task3.repository.ConeSpecification;

public class HeightSpecification implements ConeSpecification {
    private final double from;
    private final double to;

    public HeightSpecification(double from, double to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Cone cone) {
        boolean result = cone.getHeight() >= from && cone.getHeight() <= to;
        return result;
    }
}
