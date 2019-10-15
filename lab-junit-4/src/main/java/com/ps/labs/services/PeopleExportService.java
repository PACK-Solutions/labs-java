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

/**
 * Export {@link Person} into separated files
 */
public class PeopleExportService {

    private String path;

    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;

    public PeopleExportService(String path) {
        // Used by simplicity for the lab, in real needs to be replaced by an external property
        this.path = path;
    }

    /**
     * Main endpoint : export a collection of {@link Person}
     *
     * @param people A collection of {@link Person}
     */
    public long exportPeople(List<Person> people) {
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
    private boolean exportPerson(Person person) {
        String filename = person.getFirstName() + "_" + person.getLastName() + ".txt";
        String filePath = path + FileSystems.getDefault().getSeparator() + filename;
        File personFile = new File(filePath);

        // We generate parent folder and its parents if they don't exist
        personFile.getParentFile().mkdirs();
        try {
            if (personFile.createNewFile()) {
                Files.write(Paths.get(filePath), dateTimeFormatter.format(person.getBirthDate()).getBytes());
                // Used by simplicity for the lab, in real sysout ans syserr should be replaced by logger usage (slf4j at PACK)
                System.out.println(
                        String.format("%s %s a été exporté avec succès", person.getFirstName(), person.getLastName()));
                return true;
            } else {
                System.err.println(String.format("Erreur - %s %s a déjà été généré", person.getFirstName(), person.getLastName()));
            }
        } catch (IOException e) {
            // Lab improvement idea : throw a Business Exception
            System.err.println(
                    String.format("Erreur - lors de la génération de %s", filePath));
        }
        return false;
    }

}
