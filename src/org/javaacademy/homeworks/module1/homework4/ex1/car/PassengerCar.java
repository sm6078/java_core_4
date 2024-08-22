package org.javaacademy.homeworks.module1.homework4.ex1.car;

public class PassengerCar extends Car {

    private final boolean isCruiseControl;

    public PassengerCar(boolean isClean, double length, double height,
                        double width, boolean isCruiseControl) {
        super(isClean, length, height, width);
        this.isCruiseControl = isCruiseControl;
    }

    public boolean isCruiseControl() {
        return isCruiseControl;
    }
}
