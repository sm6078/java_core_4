package org.javaacademy.homeworks.module2.homework3.ex4.measured;

/**
 * класс Животное
 */
public class Animal {
    private final double bodyLength;
    private final double tailLength;

    public Animal(double bodyLength, double tailLength) {
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public double getTailLength() {
        return tailLength;
    }
}



