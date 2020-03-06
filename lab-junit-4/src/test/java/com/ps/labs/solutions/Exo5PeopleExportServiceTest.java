package com.ps.labs.solutions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ps.labs.dto.Person;
import com.ps.labs.services.PeopleExportService;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exo5PeopleExportServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(Exo5PeopleExportServiceTest.class);

    private PeopleExportService service;

    @ClassRule
    public static final TemporaryFolder tmpPersonFolder = new TemporaryFolder();

    @ClassRule
    public static final TemporaryFolder tmpPeopleFolder = new TemporaryFolder();

    @BeforeClass
    public static void setUp() {
        logger.info("C'est parti mes petits tests !! 😊");
    }

    @AfterClass
    public static void tearDown() {
        logger.info("Yo Bro ! C'est fini 🥳🎉");
    }

    @Test
    public void testExportPerson() throws IOException {
        service = new PeopleExportService(tmpPersonFolder.getRoot().getAbsolutePath());
        final Person person = new Person("DURAND", "Marcel", LocalDate.of(1977, 12, 16));
        final long counter = service.exportPeople(Collections.singletonList(person));

        Assert.assertEquals(1, counter);
        final List<Path> paths = Files.list(Paths.get(tmpPersonFolder.getRoot().getAbsolutePath())).collect(Collectors.toList());
        Assert.assertEquals(1, paths.size());
        assertGeneratedFile(paths.get(0), "Marcel_DURAND.txt", "1977-12-16");
    }

    @Test
    public void testExportPeople() throws IOException {
        service = new PeopleExportService(tmpPeopleFolder.getRoot().getAbsolutePath());
        final Person person = new Person("DUPOND", "Ayoub", LocalDate.of(1980, 2, 25));
        final Person personIoException = new Person("/", "*<>:?|\"\\", null);
        final Person personNoDate = new Person("DUPONT", "Arthur", null);
        final long counter = service.exportPeople(Arrays.asList(person, person, personIoException, personNoDate));

        Assert.assertEquals(2, counter);
        final List<Path> paths = Files.list(Paths.get(tmpPeopleFolder.getRoot().getAbsolutePath())).collect(Collectors.toList());
        Assert.assertEquals(2, paths.size());
        assertGeneratedFile(paths.get(0), "Arthur_DUPONT.txt", "no date");
        assertGeneratedFile(paths.get(1), "Ayoub_DUPOND.txt", "1980-02-25");
    }

    private void assertGeneratedFile(final Path path, final String expectedFileName, final String expectedContent) throws IOException {
        Assert.assertEquals(expectedFileName, path.getFileName().toString());
        try (final Stream<String> lines = Files.lines(path)) {
            final String fileContent = lines.collect(Collectors.joining());
            Assert.assertEquals(expectedContent, fileContent);
        }
    }

}
