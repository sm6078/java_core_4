package org.javaacademy.homeworks.module2.homework3.ex2;

import org.javaacademy.homeworks.module2.homework3.ex2.divination.Divination;
import org.javaacademy.homeworks.module2.homework3.ex2.human.Human;

public class Runner {
    //похоже из-за константы функция перестает быть чистой
    private static final int MAX_VALUE_POSITIVE_FORTUNE_TELLING = 210;

    /**
     * Задание №2: Поиск пары с помощью гадания
     * Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
     * на выход возвращает да/нет.
     * Создать с помощью лямбд выражений:
     * ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
     * бабку гадалку: принимает Человека(возраст, рост),
     * возвращает да - если (возраст + рост) больше 210, нет - если меньше или равно
     */
    public static void main(String[] args) {
        Divination<String> chamomile = name -> name.length() % 2 == 0;
        System.out.println(chamomile.checker("Petr"));
        System.out.println(chamomile.checker("Aleksandr"));
        Divination<Human> fortuneTeller = human -> human.getAge() + human.getWeight()
                > MAX_VALUE_POSITIVE_FORTUNE_TELLING;
        System.out.println(fortuneTeller.checker(new Human(21, 190)));
        System.out.println(fortuneTeller.checker(new Human(30, 180)));
    }
}
