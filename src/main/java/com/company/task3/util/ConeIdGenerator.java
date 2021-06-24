package com.company.task3.util;

public class ConeIdGenerator {
    static long coneId = 0;

    public static long generateId() {
        return ++coneId;
    }
}
