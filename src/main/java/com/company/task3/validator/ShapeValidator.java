package com.company.task3.validator;

public class ShapeValidator {

    private static final String REGEX_STRING_CONE = "([\\d+-]*\\)*\\(*\\s*)+";

    private ShapeValidator() {
    }

    public static boolean validateStringCone(String string) {
        return string.matches(REGEX_STRING_CONE);
    }
}
