package org.javaacademy.homeworks.module1.homework2.office;

public class Secretary {

    public void solveProblems(Boss boss, Manager manager, Security security) {
        System.out.printf("%s не волнуйтесь, %s все успеет!%n",
                boss.getName(), manager.getName());
        System.out.printf("%s - подождите!%n", security.getName());
    }
}
