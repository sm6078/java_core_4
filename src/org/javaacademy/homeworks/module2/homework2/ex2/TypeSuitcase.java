package org.javaacademy.homeworks.module2.homework2.ex2;

public enum TypeSuitcase {

    LIGHT("Легкий" , 5),
    MEDIUM("Средний", 10),
    HEAVY("Тяжелый", null);

    private final String name;
    private final Integer limit;

    TypeSuitcase(String name, Integer limit) {
        this.name = name;
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
