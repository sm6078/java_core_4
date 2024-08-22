package org.javaacademy.homeworks.module1.homework4.ex3;

public class Builder extends Human {

    @Override
    public String makeSound() {
        return String.format("%s. %s", "Я строитель", super.makeSound());
    }
}
