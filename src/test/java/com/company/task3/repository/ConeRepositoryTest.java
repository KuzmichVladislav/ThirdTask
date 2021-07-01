package com.company.task3.repository;

import com.company.task3.entity.Cone;
import com.company.task3.exception.ShapeException;
import com.company.task3.factory.ConeFactory;
import com.company.task3.factory.RepositoryCreator;
import com.company.task3.parser.ConeParser;
import com.company.task3.reader.DataReader;
import com.company.task3.reader.impl.DataReaderImpl;
import com.company.task3.repository.impl.*;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConeRepositoryTest {


    final String FILE_NAME = getClass().getResource("/data/coneDataFile.txt").getPath().replaceFirst("^/(.:/)", "$1");
    DataReader reader = new DataReaderImpl();
    ConeParser parser = new ConeParser();
    ConeFactory factory = new ConeFactory();
    RepositoryCreator repositoryCreator = new RepositoryCreator();
    ConeRepository repository = new ConeRepository();

    @Test
    public void generatrixLengthSpecificationTest() throws ShapeException {
        ConeSpecification s = new GeneratrixLengthSpecification(50);
        repositoryCreator.createRepository(repository, factory.createConeList(parser.parseString(reader.coneList(FILE_NAME))));
        final List<Cone> expected = repository.query(s);
        assertThat(expected.size(), is(4));
    }

    @Test
    public void heightSpecificationTest() throws ShapeException {
        ConeSpecification s = new HeightSpecification(20, 50);
        DataReader reader = new DataReaderImpl();
        repositoryCreator.createRepository(repository, factory.createConeList(parser.parseString(reader.coneList(FILE_NAME))));
        final List<Cone> expected = repository.query(s);
        assertThat(expected.size(), is(12));
    }

    @Test
    public void radiusSpecificationTest() throws ShapeException {
        ConeSpecification s = new RadiusSpecification(3, 15);
        repositoryCreator.createRepository(repository, factory.createConeList(parser.parseString(reader.coneList(FILE_NAME))));
        final List<Cone> expected = repository.query(s);
        assertThat(expected.size(), is(3));
    }

    @Test
    public void shapeVolumeSpecificationTest() throws ShapeException {
        ConeSpecification s = new ShapeVolumeSpecification(3000);
        repositoryCreator.createRepository(repository, factory.createConeList(parser.parseString(reader.coneList(FILE_NAME))));
        final List<Cone> expected = repository.query(s);
        assertThat(expected.size(), is(12));
    }

    @Test
    public void surfaceAreaSpecificationTest() throws ShapeException {
        ConeSpecification s = new SurfaceAreaSpecification(1000);
        repositoryCreator.createRepository(repository, factory.createConeList(parser.parseString(reader.coneList(FILE_NAME))));
        final List<Cone> expected = repository.query(s);
        assertThat(expected.size(), is(12));
    }
}
