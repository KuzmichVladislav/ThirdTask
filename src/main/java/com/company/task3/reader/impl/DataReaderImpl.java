package com.company.task3.reader.impl;

import com.company.task3.exception.ShapeException;
import com.company.task3.reader.DataReader;
import com.company.task3.validator.ShapeValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReaderImpl implements DataReader {

    static final Logger logger = LogManager.getLogger();

/*    public static void main(String[] args) throws ShapeException {
        DataReaderImpl a = new DataReaderImpl();
        List<String> b = new ArrayList<>();
        try {
            b = a.shapeList("src/main/resources/data/ConeDataFile.txt");
        } catch (ShapeException e) {
            e.printStackTrace();
        }

        System.out.println(b.toString());
    }*/

    @Override
    public List<String> shapeList(String path) throws ShapeException {

        Path dataPath = Paths.get(path);
        List<String> result;

        try (Stream<String> streamLines = Files.lines(dataPath)) {

            result = streamLines.filter(x -> ShapeValidator.validateStringCone(x)).collect(Collectors.toList());

            if (result.isEmpty()) {
                logger.error("no valid row found");
                throw new ShapeException("no valid row found");
            }
        } catch (FileNotFoundException e) {
            logger.error("file was not found " + e);
            throw new ShapeException(e);
        } catch (IOException e) {
            logger.error("incorrect file " + e);
            throw new ShapeException(e);
        }
        return result;
    }
}
