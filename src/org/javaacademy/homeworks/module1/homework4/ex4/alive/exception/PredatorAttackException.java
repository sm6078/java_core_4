package org.javaacademy.homeworks.module1.homework4.ex4.alive.exception;

public class PredatorAttackException extends Exception {

    public PredatorAttackException(String message) {
        super("Ошибка. " + message);
    }
}
