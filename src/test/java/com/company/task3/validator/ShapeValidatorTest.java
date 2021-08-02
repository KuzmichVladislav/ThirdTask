package com.company.task3.validator;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class ShapeValidatorTest {

    final String FILE_NAME = getClass().getResource("/data/testConeDataFile.txt").getPath().replaceFirst("^/(.:/)", "$1");

    @InjectMocks
    ShapeValidator shapeValidator;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testTrueValidateStringCone() throws Exception {
        boolean result = ShapeValidator.validateStringCone("2.47 7.65 0.93 7.27 14.78");
        Assert.assertTrue(result);
    }

    @Test
    public void testFalseValidateStringCone() throws Exception {
        boolean result = ShapeValidator.validateStringCone("2.47 7.65 0.93 7.27 z14.78");
        Assert.assertFalse(result);
    }
}
