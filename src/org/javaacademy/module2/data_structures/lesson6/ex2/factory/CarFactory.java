package org.javaacademy.module2.data_structures.lesson6.ex2.factory;

import org.javaacademy.module2.data_structures.lesson6.ex2.car.Car;

@FunctionalInterface
public interface CarFactory {

    Car makeCar();
}
