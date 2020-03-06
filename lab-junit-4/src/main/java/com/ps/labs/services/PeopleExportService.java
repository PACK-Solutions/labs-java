package com.ps.labs.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.ps.labs.dto.Person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Export {@link Person} into separated files
 */
public class PeopleExportService {

    private static final Logger logger = LoggerFactory.getLogger(PeopleExportService.class);

    private String path;

    public PeopleExportService(final String path) {
        // Used by simplicity for the lab, in real needs to be replaced by an external property
        this.path = path;
    }

    /**
     * Main endpoint : export a collection of {@link Person}
     *
     * @param people A collection of {@link Person}
     */
    public long exportPeople(final List<Person> people) {
        return people.stream()
                     .filter(Objects::nonNull)
                     .map(this::exportPerson)
                     .filter(n -> n)
                     .collect(Collectors.counting());
    }

    /**
     * Export a {@link Person} into a file
     *
     * @param person Can not be null
     * @return True if person is successfully exported
     */
    private boolean exportPerson(final Person person) {
        final String filename = person.getFirstName() + "_" + person.getLastName() + ".txt";
        final String filePath = path + FileSystems.getDefault().getSeparator() + filename;
        final File personFile = new File(filePath);

        // We generate parent folder and its parents if they don't exist
        personFile.getParentFile().mkdirs();
        try {
            if (personFile.createNewFile()) {
                Files.write(Paths.get(filePath), DateTimeFormatter.ISO_LOCAL_DATE.format(person.getBirthDate()).getBytes());
                logger.info("{} {} a été exporté avec succès", person.getFirstName(), person.getLastName());
                return true;
            } else {
                logger.warn("Erreur - {} {} a déjà été généré", person.getFirstName(), person.getLastName());
            }
        } catch (IOException e) {
            // Lab improvement idea : throw a Business Exception
            logger.error("Erreur - lors de la génération de {}", filePath);
        }
        return false;
    }

}
