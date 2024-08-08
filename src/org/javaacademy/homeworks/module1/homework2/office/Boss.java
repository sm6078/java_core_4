package org.javaacademy.homeworks.module1.homework2.office;

public class Boss {

    private final String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void customize(Manager manager) {
        System.out.printf("%s быстрее!%n", manager.getName());
    }
}
