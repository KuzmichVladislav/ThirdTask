package com.company.task3.reader.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class DataReaderImplTest {

    final String FILE_NAME = getClass().getResource("/data/testConeDataFile.txt").getPath().replaceFirst("^/(.:/)", "$1");
    @InjectMocks
    DataReaderImpl dataReaderImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConeList() throws Exception {
        List<String> result = dataReaderImpl.coneList(FILE_NAME);
        Assert.assertEquals(Arrays.<String>asList("34.90 35.9 21.85 46.33 46.86"), result);
    }
}