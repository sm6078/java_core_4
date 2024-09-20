package org.javaacademy.homeworks.module2.homework3.ex1.garden;

import org.javaacademy.homeworks.module2.homework3.ex1.fruit.Fruit;

@FunctionalInterface
public interface Garden<F extends Fruit> {

    F grows();
}
