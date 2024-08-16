package org.javaacademy.homeworks.module1.homework3.ex4;

import java.util.Arrays;

public final class City {
    private final String nameCity;
    private final House[] houses;
    private final House[] copyHouses;

    public City(String nameCity, House[] houses) {
        this.nameCity = nameCity;
        this.houses = houses;
        //делаем глубокое копирование массива
        copyHouses = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            copyHouses[i] = new House(houses[i].getStreetName(), houses[i].getNumber());
        }
    }

    public House[] getHouses() {
        return copyHouses;
    }

    @Override
    public String toString() {
        return "City{" +
                "nameCity='" + nameCity + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}
