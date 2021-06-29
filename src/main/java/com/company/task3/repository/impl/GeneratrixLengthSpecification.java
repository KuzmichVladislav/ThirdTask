package com.company.task3.repository.impl;

import com.company.task3.entity.Cone;
import com.company.task3.repository.ConeSpecification;
import com.company.task3.service.CalculateParameters;
import com.company.task3.service.impl.CalculateParametersImpl;

public class GeneratrixLengthSpecification implements ConeSpecification {

    private final double from;

    public GeneratrixLengthSpecification(double from) {
        this.from = from;
    }

    @Override
    public boolean specify(Cone cone) {
        CalculateParameters parameter = new CalculateParametersImpl();
        return from < parameter.calculateGeneratrixLength(cone);
    }
}
