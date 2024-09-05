package org.javaacademy.module2.data_structures.lesson1.ex2.output;

public class Tv implements Output {
    @Override
    public void show() {
        System.out.println("Телевизор показывает");
    }

    public void makeSound() {
        System.out.println("Телевизор орет на всю комнату");
    }
}
