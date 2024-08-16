package org.javaacademy.homeworks.module1.homework3.ex4;

public class House {
    private String streetName;
    private String number;

    public House(String streetName, String number) {
        this.streetName = streetName;
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "House{" +
                "streetName='" + streetName + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
