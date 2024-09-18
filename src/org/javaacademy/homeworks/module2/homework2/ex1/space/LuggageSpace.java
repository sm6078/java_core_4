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
        workBaggage(Utils.readAll(fileName));
    }

    private void workBaggage(Scanner scanner) throws IOException {
        while (scanner.hasNext()) {
            scanner.nextLine();
            System.out.println("Начинается загрузка на ленту");
            String lineForParsing = "";
            while (unloadBaggage.size() < MAX_AMOUNT_BAGGAGE_UNLOAD && scanner.hasNext()) {
                try {
                    lineForParsing = scanner.nextLine().trim();
                    parsing(lineForParsing);
                } catch (LuggageSpaceParsingBaggageException ignored) {
                    System.out.println("Не удалось получить номер багажа для строчки: " + lineForParsing);
                }
            }
            claimBaggage();
        }
        Utils.closedResources(scanner);
    }

    private void claimBaggage() {
        System.out.println("Лента загружена, начинается выдача багажа.");
        while (!unloadBaggage.isEmpty()) {
            System.out.printf("%s - выдан%n", unloadBaggage.poll());
        }
        System.out.println("Лента пустая, закончена выдача багажа.");
    }

    private void parsing(String text) {
        if (Utils.isNumberBaggage(text.trim())) {
            unloadBaggage.add(text.split(";")[0]);
        } else {
            throw new LuggageSpaceParsingBaggageException();
        }
    }
}
