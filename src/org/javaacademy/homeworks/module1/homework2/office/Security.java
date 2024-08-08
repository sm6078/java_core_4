package org.javaacademy.homeworks.module1.homework2.office;

public class Security {
    private final String name;

    public Security(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void ask() {
        System.out.println("Выдайте аванс!");
    }
}
