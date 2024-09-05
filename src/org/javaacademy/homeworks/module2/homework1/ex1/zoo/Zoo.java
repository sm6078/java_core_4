package org.javaacademy.homeworks.module2.homework1.ex1.zoo;

import org.javaacademy.homeworks.module2.homework1.ex1.animal.Animal;

public class Zoo<T extends Animal, K extends Animal, V extends  Animal> {

    private final T animalOne;
    private final K animalTwo;
    private final V animalThree;

    public Zoo(T animalOne, K animalTwo, V animalThree) {
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
        this.animalThree = animalThree;
    }

    public T getAnimalOne() {
        return animalOne;
    }

    public K getAnimalTwo() {
        return animalTwo;
    }

    public V getAnimalThree() {
        return animalThree;
    }
}
