package com.company.task3.factory;

import com.company.task3.entity.Cone;
import com.company.task3.repository.ConeRepository;

import java.util.List;

public class RepositoryCreator {

    public RepositoryCreator() {
    }

    public static RepositoryCreator getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public ConeRepository createRepository(ConeRepository repository, List<Cone> cones) {
        for (Cone cone : cones) {

            repository.add(cone);
        }
        return repository;
    }

    private static class SingletonHolder {

        private static final RepositoryCreator INSTANCE = new RepositoryCreator();
    }

}
