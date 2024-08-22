package org.javaacademy.homeworks.module1.homework4.ex2;

public class Airplane implements Flying {

    private final int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers > 0) {
            System.out.println("Самолет летит");
        } else {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        }
    }
}
