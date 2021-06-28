package com.company.task3.factory;

public class RepositoryCreator {
    private RepositoryCreator() {
    }

    public static RepositoryCreator getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final RepositoryCreator INSTANCE = new RepositoryCreator();
    }

/*    public ConeRepository createRepository(ConeRepository repository, List<Cone> cones) {
        for (Cone cone : cones) {

            repository.add(cone);
        }
        return repository;
    }*/

}
