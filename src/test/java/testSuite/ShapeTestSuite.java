package testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({com.company.task3.reader.impl.DataReaderImplTest.class,
    com.company.task3.repository.ConeRepositoryTest.class,
    com.company.task3.validator.ShapeValidatorTest.class})
public class ShapeTestSuite {

}
