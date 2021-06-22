package com.company.task3.validator;

public class ShapeValidator {

    private static final String REGEX_STRING_ARRAY = "([\\d+-]*\\)*\\(*\\s*)+";

    private ShapeValidator() {
    }

    public static boolean validateStringArray(String string) {
        return string.matches(REGEX_STRING_ARRAY);
    }
}
