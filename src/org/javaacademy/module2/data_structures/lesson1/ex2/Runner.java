package org.javaacademy.module2.data_structures.lesson1.ex2;

import org.javaacademy.module2.data_structures.lesson1.ex2.input.KeyBoard;
import org.javaacademy.module2.data_structures.lesson1.ex2.output.Monitor;
import org.javaacademy.module2.data_structures.lesson1.ex2.output.Tv;

public class Runner {
    public static void main(String[] args) {
        KeyBoard keyBoard = new KeyBoard();
        Monitor monitor = new Monitor();
        Tv tv = new Tv();
        Computer<KeyBoard, Tv> computer = new Computer<>(keyBoard, tv);
        //computer.input();
        KeyBoard inputObject = computer.getInputObject();

        Tv outputObject = computer.getOutputObject();
        outputObject.show();
        outputObject.makeSound();

        inputObject.escape();



    }
}
