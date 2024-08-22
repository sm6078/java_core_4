package org.javaacademy.homeworks.module1.homework4.ex4;

import org.javaacademy.homeworks.module1.homework4.ex4.alive.exception.HerbivoreRunException;
import org.javaacademy.homeworks.module1.homework4.ex4.alive.exception.PredatorAttackException;
import org.javaacademy.homeworks.module1.homework4.ex4.alive.herbivore.Elephant;
import org.javaacademy.homeworks.module1.homework4.ex4.alive.herbivore.Rabbit;
import org.javaacademy.homeworks.module1.homework4.ex4.alive.predator.Tiger;
import org.javaacademy.homeworks.module1.homework4.ex4.alive.predator.Wolf;

public class Runner {

    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) throws HerbivoreRunException, PredatorAttackException {
        final Rabbit rabbit = new Rabbit(2);
        final Elephant elephant = new Elephant(2000);
        final Tiger tiger = new Tiger(300);
        final Wolf wolf = new Wolf(50);

        rabbit.run();
        wolf.attack(rabbit);
        tiger.attack(wolf);
        tiger.attack(elephant);
        elephant.run();
        try {
            rabbit.run();
        } catch (HerbivoreRunException hre) {
            System.out.println(ANSI_RED + hre.getMessage());
        }
    }
}
