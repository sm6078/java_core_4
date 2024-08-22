package org.javaacademy.homeworks.module1.homework4.ex4.alive.predator;

public class Tiger extends Predator {
    private static final int COEFFICIENT_AGILITY = 2;

    public Tiger(double weight) {
        super(weight);
    }

    @Override
    public int getAgilityCoefficient() {
        return COEFFICIENT_AGILITY;
    }
}
