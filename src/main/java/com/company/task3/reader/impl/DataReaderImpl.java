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
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataReaderImpl implements DataReader {

    static final Logger logger = LogManager.getLogger();

    @Override
    public List<String> coneList(String path) throws ShapeException {

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
