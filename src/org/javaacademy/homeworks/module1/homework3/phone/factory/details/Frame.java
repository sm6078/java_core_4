package org.javaacademy.homeworks.module1.homework3.phone.factory.details;

/**
 * Корпус
 */
public class Frame {
    private int width;
    private int length;
    private int height;

    public Frame(int width, int length, int height) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Frame{"
                + "width="
                + width
                + ", length="
                + length
                + ", height="
                + height
                + '}';
    }
}


