package com.company.task3.reader;


import com.company.task3.exception.ShapeException;

import java.util.List;

public interface DataReader {

    List<String> ShapeList(String path) throws ShapeException;
}
