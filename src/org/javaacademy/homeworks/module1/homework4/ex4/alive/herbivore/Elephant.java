package org.javaacademy.homeworks.module1.homework4.ex4.alive.herbivore;

import org.javaacademy.homeworks.module1.homework4.ex4.alive.exception.HerbivoreRunException;

public class Elephant extends Herbivore {

    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void run() throws HerbivoreRunException {
        super.run();
        System.out.println("Слон медленно бежит");
    }
}
