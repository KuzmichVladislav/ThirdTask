package com.company.task3.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ShapeValidator {

    static final Logger logger = LogManager.getLogger();

    private static final String REGEX_STRING_CONE = "^(-?\\d+(\\.\\d*)?\\s){3}(\\d+(\\.\\d*)?\\s)(\\d+(\\.\\d*)?)$";

    private ShapeValidator() {
    }

    public static boolean validateStringCone(String string) {
        if (string.matches(REGEX_STRING_CONE)) {
            return true;
        } else {
            //  logger.warn("this row is not valid: " + string);
            return false;
        }

    }
}
