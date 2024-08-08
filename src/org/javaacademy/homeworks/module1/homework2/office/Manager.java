package org.javaacademy.homeworks.module1.homework2.office;

public class Manager {

    private final String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void scream() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
