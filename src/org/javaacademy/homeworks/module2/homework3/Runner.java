package org.javaacademy.homeworks.module2.homework3;

import org.javaacademy.homeworks.module2.homework3.ex1.fruit.Apple;
import org.javaacademy.homeworks.module2.homework3.ex1.fruit.Apricot;
import org.javaacademy.homeworks.module2.homework3.ex1.garden.Garden;
import org.javaacademy.homeworks.module2.homework3.ex2.divination.Divination;
import org.javaacademy.homeworks.module2.homework3.ex2.human.Human;
import org.javaacademy.homeworks.module2.homework3.ex3.burning.Burning;
import org.javaacademy.homeworks.module2.homework3.ex3.materials.Three;
import org.javaacademy.homeworks.module2.homework3.ex3.materials.Uranium;

public class Runner {
    //похоже из-за константы функция перестает быть чистой
    private static final int MAX_VALUE_POSITIVE_FORTUNE_TELLING = 210;

    public static void main(String[] args) {
        ex1();
        System.out.println("___________");
        ex2();
        System.out.println("___________");
        ex3();
        System.out.println("___________");


        //Задание №4: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать класс животное (длина тела, длина хвоста)
        //Создать класс лодка(длина)
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка, возвращает длину лодки
        //Измеритель животных: на вход животное, возвращает сумму длин тела и хвоста

        //Задание №5: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)  - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
        //Создать коллекцию, которая хранит отсортированные отзывы по:
        // 1.лайкам
        // 2.(Если лайки совпадают) дата + время отзыва
        // 3.(Если лайки и дата + время отзыва совпадают) id

        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
    }

    /**
     * Задание №1: Сад
     * Создать два класса, которые являются фруктами (намек на еще один класс): яблоко, абрикос.
     * (Без полей и методов).
     * Создать функциональный интерфейс сад, который умеет выращивать ФРУКТ и всех наследников фрукта.
     * Метод ничего не принимает.
     * Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
     * Яблочная ферма должна отдавать яблоко(не фрукт!), абрикосовая - абрикос(не фрукт!).
     */
    public static void ex1() {
        Garden<Apple> appleFarm = () -> new Apple();
        Garden<Apricot> apricotFarm = () -> new Apricot();
        Apple apple = appleFarm.grows();
        Apricot apricot = apricotFarm.grows();
        System.out.println(apple);
        System.out.println(apricot);
    }


    /**
     * Задание №2: Поиск пары с помощью гадания
     * Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
     * на выход возвращает да/нет.
     * Создать с помощью лямбд выражений:
     * ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
     * бабку гадалку: принимает Человека(возраст, рост),
     * возвращает да - если (возраст + рост) больше 210, нет - если меньше или равно
     */
    public static void ex2() {
        Divination<String> chamomile = name -> name.length() % 2 == 0;
        System.out.println(chamomile.checker("Petr"));
        System.out.println(chamomile.checker("Aleksandr"));
        Divination<Human> fortuneTeller = human -> human.getAge() + human.getWeight() > MAX_VALUE_POSITIVE_FORTUNE_TELLING;
        System.out.println(fortuneTeller.checker(new Human(21, 190)));
        System.out.println(fortuneTeller.checker(new Human(30, 180)));
    }

    /**
     * Задание №3: Гори ясно!
     * Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
     * любого типа.
     * Создать класс уран (без атрибутов и методов)
     * Создать класс дерево (без атрибутов и методов)
     * Создать с помощью лямбд выражений:
     * атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
     * костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!
     */
    public static void ex3() {
        Burning<Uranium> reactor = uranium -> System.out.println("Зеленый свет вокруг!");
        Burning<Three> bonfire = three -> System.out.println("Желто-красный свет вокруг!");
        reactor.doAction(new Uranium());
        bonfire.doAction(new Three());
    }
}
