package com.company.task3.factory;

import com.company.task3.entity.Cone;
import com.company.task3.exception.ShapeException;
import com.company.task3.parser.ConeParser;
import com.company.task3.reader.DataReader;
import com.company.task3.reader.impl.DataReaderImpl;
import com.company.task3.repository.ConeRepository;

import java.util.List;

public class RepositoryCreator {

    public void createRepository(List<Cone> cones) throws ShapeException {
        ConeRepository repository = new ConeRepository();
        for (Cone cone : cones) {
            repository.add(cone);
        }
    }

    public static void main(String[] args) throws ShapeException {
        ConeFactory factory = new ConeFactory();
        ConeParser parser = new ConeParser();
        DataReader reader = new DataReaderImpl();

        RepositoryCreator repositoryCreator = new RepositoryCreator();
        repositoryCreator.createRepository(factory.createShapeList(parser.parseString(reader.shapeList("src/main/resources/data/ConeDataFile.txt"))));
    }
}
