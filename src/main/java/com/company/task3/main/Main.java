package com.company.task3.main;

import com.company.task3.exception.ShapeException;
import com.company.task3.factory.ConeFactory;
import com.company.task3.factory.RepositoryCreator;
import com.company.task3.parser.ConeParser;
import com.company.task3.reader.DataReader;
import com.company.task3.reader.impl.DataReaderImpl;
import com.company.task3.repository.ConeRepository;

public class Main {

    public static void main(String[] args) throws ShapeException {
        DataReader reader = new DataReaderImpl();
        ConeParser parser = new ConeParser();
        ConeFactory factory = new ConeFactory();
        RepositoryCreator repositoryCreator = new RepositoryCreator();
        ConeRepository cones = new ConeRepository();
        repositoryCreator.createRepository(cones, factory.createConeList(parser.parseString(reader.coneList("src/main/resources/data/coneDataFile.txt"))));
        for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i));
        }
    }
}
