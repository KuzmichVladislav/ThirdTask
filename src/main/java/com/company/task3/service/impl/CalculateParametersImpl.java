package com.company.task3.service.impl;

import com.company.task3.entity.Cone;
import com.company.task3.service.CalculateParameters;

public class CalculateParametersImpl implements CalculateParameters {

    @Override
    public double calculateSurfaceArea(Cone designСone) {
        return Math.PI * designСone.getRadius() * calculateGeneratrixLength(designСone) + Math.PI * designСone.getRadius() * designСone.getRadius();
    }

    @Override
    public double calculateShapeVolume(Cone designСone) {

        return (Math.PI * designСone.getHeight() * designСone.getRadius() * designСone.getRadius()) / 3;
    }

    @Override
    public double calculateGeneratrixLength(Cone designСone) {
        return Math.sqrt(designСone.getRadius() * designСone.getRadius() + designСone.getHeight() * designСone.getHeight());
    }
}
