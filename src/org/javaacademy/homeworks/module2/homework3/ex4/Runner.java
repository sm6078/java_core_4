package org.javaacademy.homeworks.module2.homework3.ex4;

import org.javaacademy.homeworks.module2.homework3.ex4.measured.Animal;
import org.javaacademy.homeworks.module2.homework3.ex4.measured.Boat;
import org.javaacademy.homeworks.module2.homework3.ex4.measurement.Ruler;

public class Runner {
    /**
     * Задание №4: универсальная линейка
     * Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
     * Создать класс животное (длина тела, длина хвоста)
     * Создать класс лодка(длина)
     * Создать с помощью лямбд выражений:
     * Измеритель лодок: на вход лодка, возвращает длину лодки
     * Измеритель животных: на вход животное, возвращает сумму длин тела и хвоста
     */
    public static void main(String[] args) {
        Ruler<Boat> boatMeasure = boat -> (int) boat.getLength();
        Ruler<Animal> animalMeasure =
                animal -> (int) (animal.getBodyLength() + animal.getTailLength());
        System.out.printf("Длина лодки: %s единиц%n",
                boatMeasure.measure(new Boat(21d)));
        System.out.printf("Длина животного: %s единиц%n",
                animalMeasure.measure(new Animal(11d, 3d)));
    }
}