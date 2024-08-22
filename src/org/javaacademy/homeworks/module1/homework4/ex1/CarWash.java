package org.javaacademy.homeworks.module1.homework4.ex1;

import org.javaacademy.homeworks.module1.homework4.ex1.car.Car;

public class CarWash {

    private static final int TARIFF_BIG_CAR = 4000;
    private static final int TARIFF_SMALL_CARR = 2000;


    public int wash(Car car) {
        car.clean();
        if (car.getLength() > 6.0 || car.getHeight() > 2.5 || car.getWidth() > 2.0) {
            return TARIFF_BIG_CAR;
        }
        return TARIFF_SMALL_CARR;
    }

    public int wash(Car[] cars) {
        int cost = 0;
        for (Car car : cars) {
            cost += wash(car);
        }
        return cost;
    }
}
