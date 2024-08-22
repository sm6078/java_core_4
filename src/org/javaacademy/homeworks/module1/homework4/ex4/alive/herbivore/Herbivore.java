package org.javaacademy.homeworks.module1.homework4.ex4.alive.herbivore;

import org.javaacademy.homeworks.module1.homework4.ex4.alive.Alive;
import org.javaacademy.homeworks.module1.homework4.ex4.alive.exception.HerbivoreRunException;

public abstract class Herbivore extends Alive {

    public Herbivore(double weight) {
        super(weight);
    }

    public void run() throws HerbivoreRunException {
        if (!this.isAlive()) {
            throw new HerbivoreRunException("Мертвое животное не может бегать.");
        }
    }
}
