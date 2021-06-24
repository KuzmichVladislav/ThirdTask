package com.company.task3.observer;

import com.company.task3.entity.Cone;

import java.util.EventObject;

public class ConeEvent extends EventObject {

    public ConeEvent(Cone source) {
        super(source);
    }

    @Override
    public Object getSource() {
        return super.getSource();
    }
}
