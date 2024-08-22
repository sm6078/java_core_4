package org.javaacademy.homeworks.module1.homework4.ex1.car;

public abstract class Car {
    private boolean isClean;
    private final double length;
    private final double height;
    private final double width;


    public Car(boolean isClean, double length, double height, double width) {
        this.isClean = isClean;
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public boolean isClean() {
        return isClean;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void clean() {
        isClean = true;
    }
}
