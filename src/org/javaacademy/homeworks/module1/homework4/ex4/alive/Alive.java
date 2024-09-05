package org.javaacademy.homeworks.module1.homework4.ex4.alive;

public abstract class Alive {

    protected boolean isAlive = true;
    protected double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void die() {
        isAlive = false;
    }
}
