package org.javaacademy.homeworks.module2.homework3.ex1;

import org.javaacademy.homeworks.module2.homework3.ex1.fruit.Apple;
import org.javaacademy.homeworks.module2.homework3.ex1.fruit.Apricot;
import org.javaacademy.homeworks.module2.homework3.ex1.garden.Garden;

public class Runner {
    /**
     * Задание №1: Сад
     * Создать два класса, которые являются фруктами (намек на еще один класс): яблоко, абрикос.
     * (Без полей и методов).
     * Создать функциональный интерфейс сад,
     * который умеет выращивать ФРУКТ и всех наследников фрукта.
     * Метод ничего не принимает.
     * Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
     * Яблочная ферма должна отдавать яблоко(не фрукт!), абрикосовая - абрикос(не фрукт!).
     */
    public static void main(String[] args) {
        Garden<Apple> appleFarm = () -> new Apple();
        Garden<Apricot> apricotFarm = () -> new Apricot();
        Apple apple = appleFarm.grows();
        Apricot apricot = apricotFarm.grows();
        System.out.println(apple);
        System.out.println(apricot);
    }
}
