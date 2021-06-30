package com.company.task3.main;

import com.company.task3.comparator.ConeComparator;
import com.company.task3.entity.Cone;
import com.company.task3.entity.ConeParameter;
import com.company.task3.entity.ConeWarehouse;
import com.company.task3.exception.ShapeException;
import com.company.task3.factory.ConeFactory;
import com.company.task3.factory.RepositoryCreator;
import com.company.task3.parser.ConeParser;
import com.company.task3.reader.DataReader;
import com.company.task3.reader.impl.DataReaderImpl;
import com.company.task3.repository.ConeRepository;
import com.company.task3.repository.ConeSpecification;
import com.company.task3.repository.impl.GeneratrixLengthSpecification;
import com.company.task3.repository.impl.IdConeSpecification;
import com.company.task3.service.CalculateParameters;
import com.company.task3.service.impl.CalculateParametersImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) throws ShapeException {
        DataReader reader = new DataReaderImpl();
        ConeParser parser = new ConeParser();
        ConeFactory factory = new ConeFactory();
        RepositoryCreator repositoryCreator = new RepositoryCreator();
        ConeRepository cones = new ConeRepository();
        repositoryCreator.createRepository(cones, factory.createConeList(parser.parseString(reader.coneList("src/main/resources/data/coneDataFile.txt"))));
        /*for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.get(i));
        }*/

        CalculateParameters calculateParameters = new CalculateParametersImpl();
        ConeWarehouse coneWarehouse = ConeWarehouse.getInstance();
       /* for (int i = 0; i < cones.size(); i++) {
            ConeParameter coneParameter = new ConeParameter(calculateParameters.calculateShapeVolume(cones.get(i)), calculateParameters.calculateSurfaceArea(cones.get(i)), calculateParameters.calculateGeneratrixLength(cones.get(i)));
            coneWarehouse.put(cones.get(i).getConeId(), coneParameter);
        }*/
        //System.out.println(coneWarehouse.get(2));
       // cones.get(1).setHeight(58.6);
       // System.out.println(calculateParameters.calculateGeneratrixLength(cones.get(1)));
      //  System.out.println(coneWarehouse.get(2));

        /*for (int i = 0; i < cones.size(); i++) {
            System.out.println(cones.sort(ConeComparator.RADIUS).get(i));
        }*/

        ConeSpecification s = new GeneratrixLengthSpecification(1000);
        List<Cone> c1 = cones.query(s);


            System.out.println(c1);

    }
}
