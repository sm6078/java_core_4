package org.javaacademy.homeworks.module1.homework3.phone.factory.details;

/**
 * Процессор
 */
public class Processor {
    public final int frequency;

    public Processor(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return "Processor{"
                +
                "frequency="
                + frequency
                + " mhz"
                +
                '}';
    }
}
