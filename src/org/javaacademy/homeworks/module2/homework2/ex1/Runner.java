package org.javaacademy.homeworks.module2.homework2.ex1;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        reader.printFile("luggage.csv");
    }
}
