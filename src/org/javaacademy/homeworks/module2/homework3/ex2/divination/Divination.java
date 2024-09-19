package org.javaacademy.homeworks.module2.homework3.ex2.divination;

@FunctionalInterface
public interface Divination<V> {

    boolean checker(V inputValue);
}
