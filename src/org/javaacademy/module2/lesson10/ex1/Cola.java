package org.javaacademy.module2.lesson10.ex1;

public class Cola extends Product {

    public Cola(Integer price) {
        super(price);
    }

    public void open() {
        System.out.println("Кола открыта");
    }
}
