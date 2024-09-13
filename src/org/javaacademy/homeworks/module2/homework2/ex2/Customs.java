package org.javaacademy.homeworks.module2.homework2.ex2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import org.javaacademy.homeworks.module2.homework2.ex2.exception.CustomParsingFileException;
import org.javaacademy.homeworks.module2.homework2.util.Utils;

public class Customs {
    private static final int LIGHT_LIMIT = 5;
    private static final int LIGHT_MEDIUM = 10;

    //Treemap - чтобы положил по порядку (по алфавиту легкий, средний, тяжелый)
    private final Map<TypeSuitcase, Double> weighingStorage = new TreeMap<>();

    public Map<TypeSuitcase, Double> weighData(String fileName) throws IOException {
        readAll(fileName);
        return weighingStorage;
    }

    private void parsing(String text) throws CustomParsingFileException {
        if (Utils.isFlight(text.trim())) {
            addWeighToStorage(Double.valueOf(text.split(";")[1]));
        } else {
            throw new CustomParsingFileException("Не удалось получить вес чемодана");
        }
    }

    private void addWeighToStorage(Double weight) {
        if (weight < LIGHT_LIMIT) {
            weighingStorage.put(TypeSuitcase.LIGHT,
                    weighingStorage.getOrDefault(TypeSuitcase.LIGHT, Double.valueOf(0)) + weight);
        } else if (weight < LIGHT_MEDIUM) {
            weighingStorage.put(TypeSuitcase.MEDIUM,
                    weighingStorage.getOrDefault(TypeSuitcase.MEDIUM, Double.valueOf(0)) + weight);
        } else {
            weighingStorage.put(TypeSuitcase.HEAVY,
                    weighingStorage.getOrDefault(TypeSuitcase.HEAVY, Double.valueOf(0)) + weight);
        }
    }

    private void readAll(String fileName) throws IOException {
        try (InputStream resourceAsStream = Utils.getStreamInputFile(fileName);
             Scanner scanner = new Scanner(resourceAsStream)) {
            scanner.nextLine();
            while (scanner.hasNext()) {
                try {
                    parsing(scanner.nextLine());
                } catch (CustomParsingFileException ignore) {
                }
            }
        }
    }
}