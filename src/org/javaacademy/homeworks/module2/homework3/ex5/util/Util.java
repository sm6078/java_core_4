package org.javaacademy.homeworks.module2.homework3.ex5.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    private static DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

    public static LocalDateTime getFormattingData(String dateTime) {
        return LocalDateTime.parse(dateTime, formatter);
    }
}
