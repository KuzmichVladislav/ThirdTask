package com.company.task3.observer.impl;

import com.company.task3.entity.Cone;
import com.company.task3.entity.ConeParameter;
import com.company.task3.entity.Warehouse;
import com.company.task3.observer.ConeEvent;
import com.company.task3.observer.ConeObserver;
import com.company.task3.service.impl.CalculateParametersImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConeObserverImpl implements ConeObserver {

    static final Logger logger = LogManager.getLogger();

    @Override
    public void updateParameters(ConeEvent coneEvent) {
        Warehouse warehouse = Warehouse.getInstance();
        CalculateParametersImpl calculateParameters = new CalculateParametersImpl();
        Cone cone = (Cone) coneEvent.getSource();
        double shapeVolume = calculateParameters.calculateShapeVolume(cone);
        double generatrixLength = calculateParameters.calculateGeneratrixLength(cone);
        double surfaceArea = calculateParameters.calculateSurfaceArea(cone);
        ConeParameter parameters = new ConeParameter(shapeVolume, surfaceArea, generatrixLength);
        warehouse.put(cone.getConeId(), parameters);
        logger.info("parameters Cone was update: " + cone);
    }
}
