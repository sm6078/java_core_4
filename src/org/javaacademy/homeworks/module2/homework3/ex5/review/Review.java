package org.javaacademy.homeworks.module2.homework3.ex5.review;

import java.time.LocalDateTime;

/**
 * класс Отзыв
 */
public class Review {
    //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
    // дата + время отзыва (LocalDateTime)  - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
    private final int id;
    private final String text;
    private final int numberOfLikes;
    private final LocalDateTime dateTime;

    public Review(int id, String text, int numberOfLikes, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.numberOfLikes = numberOfLikes;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Отзыв №" + id + ": " +
                "id=" + id +
                ", text='" + text + '\'' +
                ", numberOfLikes=" + numberOfLikes +
                ", dateTime=" + dateTime;
    }
}
