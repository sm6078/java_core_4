package org.javaacademy.homeworks.module1.homework4.ex4.alive.exception;

public class HerbivoreRunException extends Exception {

    public HerbivoreRunException(String message) {
        super("Ошибка. " + message);
    }
}
