package org.javaacademy.homeworks.module2.homework2.ex1.space;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.javaacademy.homeworks.module1.homework5.Runner;
import org.javaacademy.homeworks.module2.homework2.ex1.exception.LuggageSpaceParsingBaggageException;

public class LuggageSpace {
    private static final String DEFAULT_NUMBER_BAGGAGE = "^[0-9]{3}[A-Z]\\d+;\\d+$";
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
        if (isFlight(text.trim())) {
            unloadBaggage.add(text.split(";")[0]);
        } else {
            throw new LuggageSpaceParsingBaggageException();
        }
    }

    private boolean isFlight(String text) {
        Pattern pattern = Pattern.compile(DEFAULT_NUMBER_BAGGAGE);
        return pattern.matcher(text).find();
    }

    private void readAll(String fileName) throws IOException {
        try (InputStream resourceAsStream = getStreamInputFile(fileName);
             Scanner scanner = new Scanner(resourceAsStream)) {
            workBaggage(scanner);
        }
    }

    private InputStream getStreamInputFile(String fileName) throws FileNotFoundException {
        InputStream resourceAsStream = Runner.class.getClassLoader().getResourceAsStream(fileName);
        if (resourceAsStream == null) {
            throw new FileNotFoundException("Файл с багажом не найден");
        }
        return resourceAsStream;
    }
}
