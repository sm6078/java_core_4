package org.javaacademy.homeworks.module2.homework4.ex3;

import java.util.List;
import java.util.Optional;

public class Runner {
    /**
     * //Задание №3 - Небоскребы, небоскребы, а я...
     * //1. Создать Класс Небоскреб - имя небоскреба, его высота в метрах.
     * //2. Необходимо создать небоскребы:
     * //Всемирный торговый центр - 541м
     * //Шанхайская башня - 632м
     * //Бурдж-Халифа - 828м
     * //Международный финансовый центр Пинань - 599м
     * //Абрадж аль-Бейт - 601м
     * //Всемирный центр Лотте - 555м
     * //3. Занести небоскребы в List! Дважды положить бурдж халифа в лист.
     * //4. С помощью стримов:
     * //4.1 Убрать дубликаты и сохранить в новый лист (далее работаем с этим листом).
     * //(РАЗНЫЕ СТРИМЫ!)
     * //4.2. Вывести только первые три небоскреба.
     * //4.3. Вывести самый высокий небоскреб.
     * //4.4. Вывести те небоскребы, которые выше километра.
     * //Если выше километра нет, то вывести на экран: небоскреба выше километра - нет.
     */
    public static void main(String[] args) {
        List<Skyscraper> skyscrapers = List.of(new Skyscraper("Всемирный торговый центр", 541),
                new Skyscraper("Шанхайская башня", 632),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Международный финансовый центр Пинань", 599),
                new Skyscraper("Абрадж аль-Бейт", 601),
                new Skyscraper("Всемирный центр Лотте", 555),
                new Skyscraper("Бурдж-Халифа", 828));

        System.out.println("Исходный");
        skyscrapers.forEach(System.out::println);
        System.out.println();
        System.out.println("Без дублей");
        List<Skyscraper> skyscraperNoDouble = skyscrapers.stream()
                .distinct().toList();
        skyscraperNoDouble.forEach(System.out::println);
        System.out.println("__________________");
        skyscrapers.stream()
                .limit(3).forEach(System.out::println);
        System.out.println("__________________");
        System.out.println("Самый высокий небоскреб: ");
        Optional<Skyscraper> optional = skyscrapers.stream()
                .max((a, b) -> a.getHeight() - b.getHeight());
        System.out.println(optional.get());
        System.out.println("__________________");
        String bigSkyscrapers = skyscrapers.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000)
                .map(Skyscraper::toString)
                .reduce("Небоскребов выше 1000м не найдено ", "%s\n%s"::formatted);
        System.out.println(bigSkyscrapers);
    }
}
