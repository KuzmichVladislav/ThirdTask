package com.company.task3.repository.impl;

import com.company.task3.entity.Cone;
import com.company.task3.repository.ConeSpecification;

public class IdConeSpecification implements ConeSpecification {
    private final long from;
    private final long to;

    public IdConeSpecification(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean specify(Cone cone) {
        boolean result = cone.getConeId() >= from && cone.getConeId() <= to;
        return result;
    }
}
