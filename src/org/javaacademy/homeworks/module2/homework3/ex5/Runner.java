package org.javaacademy.homeworks.module2.homework3.ex5;

import static org.javaacademy.homeworks.module2.homework3.ex5.util.Util.getFormattingData;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import org.javaacademy.homeworks.module2.homework3.ex5.review.Review;

public class Runner {
    /**
     * Задание №5: сортировка отзывов
     * Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
     * дата + время отзыва (LocalDateTime)  - НЕ ИСПОЛЬЗОВАТЬ COMPARABLE!
     * Создать коллекцию, которая хранит отсортированные отзывы по:
     * 1.лайкам
     * 2.(Если лайки совпадают) дата + время отзыва
     * 3.(Если лайки и дата + время отзыва совпадают) id
     * Уникальность определяется на основе сортировки.
     * Создать comparator через лямбда выражение, для сортировки отзывов:
     * Пример, отсортированный :
     * (id, текст, кол-во лайков, дата+время)
     * отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
     * отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
     * отзыв №4: 4, плохой товар, 100, 25.01.2024 13:37
     * отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
     */
    public static void main(String[] args) {
        Comparator<Review> comparator = (rev1, rev2) -> {
            int result = rev2.getNumberOfLikes() - rev1.getNumberOfLikes() != 0
                    ? rev2.getNumberOfLikes() - rev1.getNumberOfLikes()
                    : rev2.getDateTime().compareTo(rev1.getDateTime());
            if (result == 0) {
                result = rev2.getId() - rev1.getId();
            }
            return result;
        };
        Set<Review> reviewSet = new TreeSet<>(comparator);
        reviewSet.add(new Review(1, "отличный товар", 200, getFormattingData("25.01.2024 13:37")));
        reviewSet.add(new Review(3, "плохой товар", 100, getFormattingData("25.01.2024 13:37")));
        reviewSet.add(new Review(4, "плохой товар", 100, getFormattingData("25.01.2024 13:37")));
        reviewSet.add(new Review(2, "так себе товар", 100, getFormattingData("25.01.2024 16:37")));
        reviewSet.forEach(review -> System.out.println(review));
    }
}