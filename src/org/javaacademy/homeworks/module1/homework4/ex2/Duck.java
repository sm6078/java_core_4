package org.javaacademy.homeworks.module1.homework4.ex2;

public class Duck implements Flying {

    private final boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (!isInjured) {
            System.out.println("Утка летит");
        } else {
            throw new FlyException("Ошибка: утка ранена");
        }
    }
}
