package com.company.task3.repository;

import com.company.task3.entity.Cone;

import java.util.*;

public class ConeRepository {

    private final List<Cone> cones = new ArrayList<>();

    private ConeRepository() {
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

    public int size() {
        return cones.size();
    }

    public List<Cone> query(ConeSpecification coneSpecification) {
        List<Cone> result = new ArrayList<>();
        for (Cone cone : cones) {
            if (coneSpecification.specify(cone)) {
                result.add(cone);
            }
        }
        return result;
    }

    public List<Cone> sort(Comparator<? super Cone> comparator) {
        SortedSet<Cone> sortedCones = new TreeSet<>(comparator);
        return new ArrayList<>(sortedCones);
    }

    private static class SingletonHolder {
        private static final ConeRepository INSTANCE = new ConeRepository();
    }
}
