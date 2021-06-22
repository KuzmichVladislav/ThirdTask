package com.company.task3.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Stream;

public class ConeParser {

    public static final Logger logger = LogManager.getLogger();

    private static final String REGEX_SPLIT_ARRAY = "\\p{Punct}*\\s+";

    public double[] parseString(String stringCone) {
        String[] splited = stringCone.split(REGEX_SPLIT_ARRAY);
        double[] arrayOfDoubles = Stream.of(splited).mapToDouble(Double::parseDouble).toArray();
        logger.info("Parsing data: " + arrayOfDoubles.toString());
        return arrayOfDoubles;
    }
}
