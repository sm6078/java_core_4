package org.javaacademy.homeworks.module1.homework5.ex1.exception;

public class DonationParsingException extends RuntimeException {
    public DonationParsingException() {
    }

    public DonationParsingException(String message) {
        super(message);
    }
}
