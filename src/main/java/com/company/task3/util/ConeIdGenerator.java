package com.company.task3.util;

public class ConeIdGenerator {

    public static long coneId = 0;

    private ConeIdGenerator() {
    }

    public static long generateConeId() {
        return ++coneId;
    }
}
