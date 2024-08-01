package org.javaacademy.homeworks.module1.homework1;

import java.util.Scanner;

//Необходимо написать калькулятор. Алгоритм:
//1. Вывести на экран: Введите первое число
//2. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
//3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
//4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
//4. Вывести на экран: Введите второе число
//5. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
//6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
//Если знак операции не относится к перечисленным выше, вывести - "Ошибка"
public class Calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double numberOne = Double.parseDouble(scanner.nextLine());
        System.out.print("Введите знак операции - \"+\", \"-\", \"*\", \"/\": ");
        String operation = scanner.nextLine();
        System.out.print("Введите второе число: ");
        double numberTwo = Double.parseDouble(scanner.nextLine());
        scanner.close();
        if (operation.equals("+")) {
            System.out.println("Результат: " + (numberOne + numberTwo));
        } else if (operation.equals("-")) {
            System.out.println("Результат: " + (numberOne - numberTwo));
        } else if (operation.equals("*")) {
            System.out.println("Результат: " + (numberOne * numberTwo));
        } else if (operation.equals("/")) {
            System.out.println("Результат: " + (numberOne / numberTwo));
        } else {
            System.out.println("Произошла ошибка.");
        }
    }
}
