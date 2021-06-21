package com.company.task3.util;

public class IdGenerator {
    public static long coneId;

    public static long generateId() {
        return ++coneId;
    }
}
