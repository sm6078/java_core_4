package org.javaacademy.homeworks.module2.homework4.ex2;

import java.util.List;

public class Runner {

    /**
     * //Задание №2 - Сколько здесь "о" ?
     * //1. Создать набор уникальных слов: "тон", "тополь", "боль", "рой", "стройка"
     * //2. Создать стрим у набора
     * //2.1 Посчитать количество букв "о" в одном слове
     * //2.2 Посчитать сумму количества букв "о" во всех словах из набора
     * //2.3 Вывести на экран сумму букв "о". Если в словах нет буквы "о", то распечатать ноль.
     * //
     * //ожидаемый результат:
     * //6
     */
    public static void main(String[] args) {
        List<String> words = List.of("тоооон", "тополь", "боль", "рой", "стройка");
        int result1 = words.stream()
                .mapToInt(e -> e.length() - e.replace("о", "").length())
                .findFirst()
                .orElse(0);
        System.out.println(result1);

        int result2 = words.stream()
                .mapToInt(e -> e.length() - e.replace("о", "").length())
                .sum();
        System.out.println(result2);
    }
}
