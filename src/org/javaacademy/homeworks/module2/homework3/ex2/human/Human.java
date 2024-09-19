package org.javaacademy.homeworks.module2.homework3.ex2.human;

/**
 * класс Человек
 */
public class Human {
    private final int age;
    private final int weight;

    public Human(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }
}
