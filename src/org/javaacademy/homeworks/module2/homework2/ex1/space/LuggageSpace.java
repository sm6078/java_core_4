package org.javaacademy.homeworks.module2.homework2.ex1.space;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.javaacademy.homeworks.module2.homework2.ex1.exception.LuggageSpaceParsingBaggageException;
import org.javaacademy.homeworks.module2.homework2.util.Utils;

public class LuggageSpace {
    private static final int MAX_AMOUNT_BAGGAGE_UNLOAD = 10;

    private final Queue<String> unloadBaggage = new LinkedList<>();

    public void unloading(String fileName) throws IOException {
        readAll(fileName);
    }

    private void workBaggage(Scanner scanner) {
        while (scanner.hasNext()) {
            scanner.nextLine();
            System.out.println("Начинается загрузка на ленту");
            String str = "";
            while (unloadBaggage.size() < MAX_AMOUNT_BAGGAGE_UNLOAD && scanner.hasNext()) {
                try {
                    str = scanner.nextLine().trim();
                    parsing(str);
                } catch (LuggageSpaceParsingBaggageException ignored) {
                    System.out.println("Не удалось получить номер багажа для строчки: " + str);
                }
            }
            claimBaggage();
        }
    }

    private void claimBaggage() {
        System.out.println("Лента загружена, начинается выдача багажа.");
        while (!unloadBaggage.isEmpty()) {
            System.out.printf("%s - выдан%n", unloadBaggage.poll());
        }
        System.out.println("Лента пустая, закончена выдача багажа.");
    }

    private void parsing(String text) {
        if (Utils.isFlight(text.trim())) {
            unloadBaggage.add(text.split(";")[0]);
        } else {
            throw new LuggageSpaceParsingBaggageException();
        }
    }

    private void readAll(String fileName) throws IOException {
        try (InputStream resourceAsStream = Utils.getStreamInputFile(fileName);
             Scanner scanner = new Scanner(resourceAsStream)) {
             workBaggage(scanner);
        }
    }
}
