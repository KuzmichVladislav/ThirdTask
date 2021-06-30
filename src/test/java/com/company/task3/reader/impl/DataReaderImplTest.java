package com.company.task3.reader.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

public class DataReaderImplTest {

    @InjectMocks
    DataReaderImpl dataReaderImpl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConeList() throws Exception {
        List<String> result = dataReaderImpl.coneList("src/main/resources/data/testConeDataFile.txt");
        Assert.assertEquals(Arrays.<String>asList("34.90 35.9 21.85 46.33 46.86"), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme