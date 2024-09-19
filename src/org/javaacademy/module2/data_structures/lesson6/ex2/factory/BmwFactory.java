package org.javaacademy.module2.data_structures.lesson6.ex2.factory;

import org.javaacademy.module2.data_structures.lesson6.ex2.car.Bmw;
import org.javaacademy.module2.data_structures.lesson6.ex2.car.Car;

public class BmwFactory implements CarFactory {

    @Override
    public Car makeCar() {
        return new Bmw();
    }
}
