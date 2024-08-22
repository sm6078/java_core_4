package org.javaacademy.homeworks.module1.homework4.ex4.alive.predator;

import org.javaacademy.homeworks.module1.homework4.ex4.alive.Alive;
import org.javaacademy.homeworks.module1.homework4.ex4.alive.exception.PredatorAttackException;

public abstract class Predator extends Alive {
    private static final int DEFAULT_COEFFICIENT_AGILITY = 1;

    public Predator(double weight) {
        super(weight);
    }

    public void attack(Alive alive) throws PredatorAttackException {
        if (!this.isAlive()) {
            throw  new PredatorAttackException("Мертвое животное не может нападать.");
        }
        if (this.getWeight() * getAgilityCoefficient() > alive.getWeight()) {
            alive.die();
            this.setWeight(this.getWeight() + alive.getWeight() / 3);
        } else {
            this.die();
        }
    }

    public int getAgilityCoefficient() {
        return DEFAULT_COEFFICIENT_AGILITY;
    }
}
