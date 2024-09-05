package org.javaacademy.module2.data_structures.lesson1.ex4;

public abstract class Car {
    protected boolean isClean = false;

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
