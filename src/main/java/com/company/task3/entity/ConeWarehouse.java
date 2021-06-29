package com.company.task3.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ConeWarehouse {

    private static ConeWarehouse mInstance;
    private final Map<Long, ConeParameter> parameters = new HashMap<>();

    private ConeWarehouse() {
    }

    public static ConeWarehouse getInstance() {
        if (mInstance == null) {
            mInstance = new ConeWarehouse();
        }
        return mInstance;
    }

    public ConeParameter put(long id, ConeParameter parameter) {
        return parameters.put(id, parameter);
    }

    public Optional<ConeParameter> remove(long id) {
        ConeParameter coneParameter = parameters.remove(id);
        return (coneParameter != null ? Optional.of(coneParameter) : Optional.empty());
    }

    public Optional<ConeParameter> get(long id) {
        ConeParameter coneParameter = parameters.get(id);
        return (coneParameter != null ? Optional.of(coneParameter) : Optional.empty());
    }
}
