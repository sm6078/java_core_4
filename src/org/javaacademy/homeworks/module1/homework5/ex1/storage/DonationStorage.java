package org.javaacademy.homeworks.module1.homework5.ex1.storage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import org.javaacademy.homeworks.module1.homework5.Runner;
import org.javaacademy.homeworks.module1.homework5.ex1.exception.DonationParsingException;

public class DonationStorage {

    private Entry[] donations;

    public DonationStorage(String[] countries) {
        donations = new Entry[countries.length];
        for (int i = 0; i < countries.length; i++) {
            donations[i] = new Entry(countries[i]);
        }
    }

    public void print(String fileName) throws IOException {
        read(fileName);
        System.out.println("Список пожертвований по странам:");
        for (Entry entry : donations) {
            System.out.println(entry);
        }
    }

    private void read(String fileName) throws IOException {
        try (InputStream resourceAsStream = getStreamInputFile(fileName);
             Scanner scanner = new Scanner(resourceAsStream)) {
            while (scanner.hasNext()) {
                try {
                    parsing(scanner.nextLine());
                } catch (DonationParsingException e) {
                    //System.out.println(e.getMessage());
                }
            }
        }
    }

    private void parsing(String line) {
        double money = getMoney(line);
        if (money < 0) {
            throw new DonationParsingException("Ошибка. В строке ошибка при указании суммы");
        } else {
            int index = getIndexCountryName(line);
            if (index < 0) {
                throw new DonationParsingException("Ошибка. В строке не найдена страна доната");
            } else {
                updateSum(index, money);
            }
        }
    }

    private int getIndexCountryName(String str) {
        for (int i = 0; i < donations.length; i++) {
            if (donations[i].countryName.equals(str.split(";")[0])) {
                return i;
            }
        }
        return -1;
    }

    private Double getMoney(String str) {
        double money = -1;
        try {
            money = Double.parseDouble(str.split(";")[1].replace(",", "."));
        } catch (NumberFormatException nfe) {
            //System.out.println(nfe.getMessage());
        }
        return money;
    }

    private void updateSum(int index, double updateSum) {
        BigDecimal currentSum = donations[index].sum;
        donations[index].sum = currentSum.add(new BigDecimal(updateSum));
    }

    private InputStream getStreamInputFile(String fileName) throws IOException {
        InputStream resourceAsStream = Runner.class.getClassLoader().getResourceAsStream(fileName);
        if (resourceAsStream == null) {
            throw new FileNotFoundException("Файл с донатами не найден");
        }
        return resourceAsStream;
    }

    /**
     * Класс запись о донате
     */
    static class Entry {
        private final String countryName;
        private BigDecimal sum = new BigDecimal("0");

        public Entry(String countryName) {
            this.countryName = countryName;
        }

        @Override
        public String toString() {
            return String.format("%s - %s", countryName, sum.setScale(2, RoundingMode.DOWN));
        }
    }
}
