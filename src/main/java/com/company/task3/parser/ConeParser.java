package com.company.task3.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConeParser {

    public static final Logger logger = LogManager.getLogger();

    private static final String REGEX_SPLIT_CONE = "\\p{Punct}*\\s+";

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
