package org.javaacademy.homeworks.module2.homework4.ex3;

import java.util.Objects;

/**
 * Небоскреб
 */
public class Skyscraper {
    private final String name;
    private final int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skyscraper that)) return false;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Skyscraper{" +
                "name='" + name + '\'' +
                ", height=" + height + "m" +
                '}';
    }
}
