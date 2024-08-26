package org.javaacademy.homeworks.module1.homework4.ex1.car;

public abstract class Car {
    protected boolean isClean;
    protected final double length;
    protected final double height;
    protected final double width;

    public Car(boolean isClean, double length, double height, double width) {
        this.isClean = isClean;
        this.length = length;
        this.height = height;
        this.width = width;
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
