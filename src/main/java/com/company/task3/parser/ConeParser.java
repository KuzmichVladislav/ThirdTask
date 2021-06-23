package com.company.task3.parser;

import com.company.task3.exception.ShapeException;
import com.company.task3.reader.impl.DataReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConeParser {

    public static final Logger logger = LogManager.getLogger();

    private static final String REGEX_SPLIT_CONE = "\\p{Punct}*\\s+";

/*    public static void main(String[] args) throws ShapeException {
        DataReaderImpl a = new DataReaderImpl();
        List<String> b = new ArrayList<>();
        try {
            b = a.shapeList("src/main/resources/data/ConeDataFile.txt");
        } catch (ShapeException e) {
            e.printStackTrace();
        }

        ConeParser d = new ConeParser();
        List<double[]> c = d.parseString(b);

        for (double[] tab : c) {
            for (double i : tab) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }*/

    public List<double[]> parseString(List<String> shapeStringList) {
        List<double[]> shapeDoubleList = new ArrayList<>();
        for (String s : shapeStringList) {
            String[] splited = s.split(REGEX_SPLIT_CONE);
            double[] arrayOfDoubles = Stream.of(splited).mapToDouble(Double::parseDouble).toArray();
            shapeDoubleList.add(arrayOfDoubles);
        }
        logger.info("Parsing data: " + shapeDoubleList.toString());
        return shapeDoubleList;
    }

}
