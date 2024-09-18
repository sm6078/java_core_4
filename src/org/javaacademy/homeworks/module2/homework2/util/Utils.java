package org.javaacademy.homeworks.module2.homework2.util;

import org.javaacademy.homeworks.module1.homework5.Runner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utils {

    private static final String DEFAULT_NUMBER_BAGGAGE = "^[0-9]{3}[A-Z]\\d+;\\d+$";

    private static InputStream resourceAsStream;

    public static InputStream getStreamInputFile(String fileName) throws FileNotFoundException {
        InputStream resourceAsStream = Runner.class.getClassLoader().getResourceAsStream(fileName);
        if (resourceAsStream == null) {
            throw new FileNotFoundException("Файл не найден");
        }
        return resourceAsStream;
    }

    public static Scanner readAll(String fileName) throws IOException {
        resourceAsStream = Utils.getStreamInputFile(fileName);
        return new Scanner(resourceAsStream);
    }

    public static void closedResources(Scanner scanner) throws IOException {
        if (resourceAsStream != null) {
            resourceAsStream.close();
        }
        if (scanner != null) {
            scanner.close();
        }
    }

    public static boolean isNumberBaggage(String text) {
        Pattern pattern = Pattern.compile(DEFAULT_NUMBER_BAGGAGE);
        return pattern.matcher(text).find();
    }
}
