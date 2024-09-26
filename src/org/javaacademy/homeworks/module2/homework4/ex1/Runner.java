package org.javaacademy.homeworks.module2.homework4.ex1;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Runner {
    /**
     * Задание №1 - Список спец номеров
     * Нам необходимо распечатать список номеров, которые принадлежат чиновникам
     * 1. Создать класс машина. У машины есть номер.
     * 2. Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
     * 3. Создать 50 машин с номерами к0[01-50]се178 (где [01-50] - это все значения от 01 до 50)
     * 4. Объединить машины в единый стрим
     * 5. Оставить в объединенном стриме машины с номерами 04[0-9] - это номера,
     * выдаваемые чиновникам
     * 6. Получить из оставшихся машин номера.
     * 7. Распечатать номера.
     * ожидаемый результат:
     * a040ан799
     * a041ан799
     * ...
     * k048се178
     * k049се178
     */
    public static void main(String[] args) {
        Stream<Car> cars1 = Stream
                .iterate(1, i -> i <= 50, i -> i + 1)
                .map(i -> new Car(String.format("%s%02d%s", "а0", i, "ан799")));
        Stream<Car> cars2 = Stream
                .iterate(1, i -> i <= 50, i -> i + 1)
                .map(i -> new Car(String.format("%s%02d%s", "к0", i, "се178")));

        String numbersSpecialCars = Stream.concat(cars1, cars2)
                .map(Car::getNumber)
                .filter(number -> number.matches(".*04[0-9].*"))
                .collect(Collectors.joining("\n"));
        System.out.println(numbersSpecialCars);
    }
}
