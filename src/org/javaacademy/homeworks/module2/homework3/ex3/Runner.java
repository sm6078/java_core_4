package org.javaacademy.homeworks.module2.homework3.ex3;

import org.javaacademy.homeworks.module2.homework3.ex3.burning.Burning;
import org.javaacademy.homeworks.module2.homework3.ex3.materials.Three;
import org.javaacademy.homeworks.module2.homework3.ex3.materials.Uranium;

public class Runner {
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
    public static void main(String[] args) {
        Burning<Uranium> reactor = uranium -> {
            System.out.println("Принимает в себя уран.");
            System.out.println("Зеленый свет вокруг!");
        };
        Burning<Three> bonfire = three -> {
            System.out.println("Принимает в себя дерево.");
            System.out.println("Желто-красный свет вокруг!");
        };
        reactor.doAction(new Uranium());
        System.out.println("______");
        bonfire.doAction(new Three());
    }
}
