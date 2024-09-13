package org.javaacademy.homeworks.module2.homework2.ex2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import org.javaacademy.homeworks.module2.homework2.ex2.exception.CustomParsingFileException;
import org.javaacademy.homeworks.module2.homework2.util.Utils;

public class Customs {

    public Map<TypeSuitcase, Double> getStatisticsByBaggageWeight(String fileName) throws IOException {
        Map<TypeSuitcase, Double> weighingStorage = new TreeMap<>();
        readAll(fileName, weighingStorage);
        return weighingStorage;
    }

    private void parsing(String text, Map<TypeSuitcase, Double> weighingStorage) throws CustomParsingFileException {
        if (Utils.isNumberBaggage(text.trim())) {
            addWeighToStorage(Double.valueOf(text.split(";")[1]), weighingStorage);
        } else {
            throw new CustomParsingFileException("Не удалось получить вес чемодана");
        }
    }

    private void addWeighToStorage(Double weight, Map<TypeSuitcase, Double> weighingStorage) {
        if (weight < TypeSuitcase.LIGHT.getLimit()) {
            weighingStorage.put(TypeSuitcase.LIGHT,
                    weighingStorage.getOrDefault(TypeSuitcase.LIGHT, Double.valueOf(0)) + weight);
        } else if (weight < TypeSuitcase.MEDIUM.getLimit()) {
            weighingStorage.put(TypeSuitcase.MEDIUM,
                    weighingStorage.getOrDefault(TypeSuitcase.MEDIUM, Double.valueOf(0)) + weight);
        } else {
            weighingStorage.put(TypeSuitcase.HEAVY,
                    weighingStorage.getOrDefault(TypeSuitcase.HEAVY, Double.valueOf(0)) + weight);
        }
    }

    private void readAll(String fileName, Map<TypeSuitcase, Double> weighingStorage) throws IOException {
        Scanner scanner = Utils.readAll(fileName);
        scanner.nextLine();
        while (scanner.hasNext()) {
            try {
                parsing(scanner.nextLine(), weighingStorage);
            } catch (CustomParsingFileException ignore) {
            }
        }
        Utils.closedResources(scanner);
    }
}