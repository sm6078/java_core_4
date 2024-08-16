package org.javaacademy.homeworks.module1.homework3.phone.factory.details;

/**
 * Камера
 */
public class Camera {
    private final int numberOfMegapixels;

    public Camera(int numberOfMegapixels) {
        this.numberOfMegapixels = numberOfMegapixels;
    }

    public int getNumberOfMegapixels() {
        return numberOfMegapixels;
    }

    public void makePhoto() {
        System.out.println("Камера делает фотографию");
    }

    @Override
    public String toString() {
        return "Camera{"
                + "numberOfMegapixels=" + numberOfMegapixels + " megapixels"
                + '}';
    }
}
