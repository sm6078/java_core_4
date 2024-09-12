package org.javaacademy.homeworks.module2.homework2.ex1;

import org.javaacademy.homeworks.module1.homework5.Runner;
import org.javaacademy.homeworks.module1.homework5.ex1.exception.DonationParsingException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Считываеталь файла
 */
public class Reader {

    private void read(String fileName) throws IOException {
        try (InputStream resourceAsStream = getStreamInputFile(fileName);
             Scanner scanner = new Scanner(resourceAsStream)) {
            while (scanner.hasNext()) {
                try {
                    System.out.println(scanner.nextLine());
                } catch (DonationParsingException e) {
                    //System.out.println(e.getMessage());
                }
            }
        }
    }

    private InputStream getStreamInputFile(String fileName) throws IOException {
        InputStream resourceAsStream = Runner.class.getClassLoader().getResourceAsStream(fileName);
        if (resourceAsStream == null) {
            throw new FileNotFoundException("Файл с багажом не найден");
        }
        return resourceAsStream;
    }

    public void printFile(String fileName) throws IOException {
        read(fileName);
    }

}
