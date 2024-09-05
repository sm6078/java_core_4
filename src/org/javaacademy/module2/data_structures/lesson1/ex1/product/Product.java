package org.javaacademy.module2.data_structures.lesson1.ex1.product;

public abstract class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
