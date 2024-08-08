package org.javaacademy.homeworks.module1.homework2.office;

public class Runner {
    public void init() {
        Office office = new Office(new Boss("Петр Николаевич"),
                new Manager("Володя"),
                new Secretary(),
                new Security("Петрович"));

        office.workDay();
    }
}
