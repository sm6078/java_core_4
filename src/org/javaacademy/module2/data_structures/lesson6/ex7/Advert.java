package org.javaacademy.module2.data_structures.lesson6.ex7;

import java.math.BigDecimal;

/**
 * Объявление
 */
public class Advert {
    private String text;
    private BigDecimal price;

    public Advert(String text, BigDecimal price) {
        this.text = text;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "text='" + text + '\'' +
                ", price=" + price +
                '}';
    }

    public String getText() {
        return text;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
