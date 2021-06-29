package com.company.task3.repository.impl;

import com.company.task3.entity.Cone;
import com.company.task3.repository.ConeSpecification;
import com.company.task3.service.CalculateParameters;
import com.company.task3.service.impl.CalculateParametersImpl;

public class ShapeVolumeSpecification implements ConeSpecification {

    private final double from;

    public ShapeVolumeSpecification(double from) {
        this.from = from;
    }

    @Override
    public boolean specify(Cone cone) {
        CalculateParameters parameter = new CalculateParametersImpl();
        return from < parameter.calculateShapeVolume(cone);
    }
}
