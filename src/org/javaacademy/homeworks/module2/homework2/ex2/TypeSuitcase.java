package org.javaacademy.homeworks.module2.homework2.ex2;

public enum TypeSuitcase {

    LIGHT("Легкий" , 5),
    MEDIUM("Средний", 10),
    HEAVY("Тяжелый", 10);

    private final String name;
    private final int limit;

    TypeSuitcase(String name, int limit) {
        this.name = name;
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public String toString() {
        return name;
    }
}
