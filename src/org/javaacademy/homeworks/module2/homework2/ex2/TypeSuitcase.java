package org.javaacademy.homeworks.module2.homework2.ex2;

public enum TypeSuitcase {
    LIGHT("Легкий"),
    MEDIUM("Средний"),
    HEAVY("Тяжелый");

    private final String name;

    TypeSuitcase(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
