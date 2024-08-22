package org.javaacademy.homeworks.module1.homework4.ex1.car;

public class Bus extends Car {

    private final int maxNumberPassengers;

    public Bus(boolean isClean, double length, double height,
               double width, int maxNumberPassengers) {
        super(isClean, length, height, width);
        this.maxNumberPassengers = maxNumberPassengers;
    }

    public int getMaxNumberPassengers() {
        return maxNumberPassengers;
    }
}
