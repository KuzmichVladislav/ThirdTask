package com.company.task3.repository;

import com.company.task3.entity.Cone;

import java.util.ArrayList;
import java.util.List;

public class ConeRepository {

    private List<Cone> cones = new ArrayList<>();

    private static class SingletonHolder {
        private static final ConeRepository INSTANCE = new ConeRepository();
    }

    public static ConeRepository getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public boolean add(Cone cone) {
        return cones.add(cone);
    }

    public Cone remove(int index) {
        return cones.remove(index);
    }

    public Cone get(int index) {
        return cones.get(index);
    }
    
}
