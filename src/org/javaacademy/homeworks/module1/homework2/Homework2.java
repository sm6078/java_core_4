package org.javaacademy.homeworks.module1.homework2;

import java.util.Arrays;
import java.util.Random;
import org.javaacademy.homeworks.module1.homework2.office.Runner;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        System.out.println("___________________________________________");
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        ex5();
    }

    //Дан массив со словами
    //String[] words = {"Это", "шашлык", "на", "шампуре"};
    //С помощью циклов и функции String.substring составить итоговый текст
    //Это-шашлык-на-шампуре
    public static void ex1() {
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String result = "";
        for (String str : words) {
            result += String.format("-%s", str);
        }
        System.out.println(result.substring(1));
    }

    //Дан массив с массивом чисел внутри
    //Посчитать сумму каждой диагонали ИСПОЛЬЗУЯ цикл(ы)
    //Вывести на экран
    public static void ex2() {

        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        //С левого верхнего угла к нижнему правому
        int leftUpToRightDownSum = 0; //
        //С левого нижнего угла к верхнему правому
        int leftDownToRightUpSum = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
            leftDownToRightUpSum += arrayOfNumbers[arrayOfNumbers.length - 1 - i][i];
        }
        System.out.println("Сумма элементов с верхнего левого угла к нижнему правому: "
                + leftUpToRightDownSum);
        System.out.println("Сумма элементов с левого нижнего угла к верхнему правому: "
                + leftDownToRightUpSum);


    }

    //Дан распределитель случайных чисел
    //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.
    //Вывести номер попытки, с которой получилось получить случайным образом число 999.
    public static void ex3() {
        Random random = new Random(1);
        int numberOfAttempts = 0;
        while (true) {
            int number = random.nextInt(1000);
            numberOfAttempts++;
            if (number == 999) {
                break;
            }
        }
        System.out.println("Номер попытки, с которой получилось получить случайным образом"
                + "число 999 = " + numberOfAttempts);
    }

    public static void ex4() {
        //Создать пакет office.
        //Создать класс офис, в котором есть босс, менеджер, секретарь, охранник.
        //Босс обладает именем. Умеет подгонять менеджера - "{Имя менеджера}" быстрее!
        //Менеджер обладает именем. Умеет кричать - "я ничего не успеваю, помогите!".
        //Секретарь умеет просить менеджера и босса успокоится, а охранника подождать:
        //"{Имя босса} не волнуйтесь, {имя менеджера} все успеет. {имя охранника} - подождите!"
        //Охранник обладает именем. Просит выдать ему аванс.
        //В офисе есть метод рабочий день:
        //--Босс начинает подгонять менеджера
        //--Менеджер кричит
        //--Охранник просит аванс
        //--Секретарша всех успокаивает, и просит подождать
        //Создать класс Runner, в котором:
        //Создать босса (Петр Николаевич), Менеджера (Володя), охранника (Петрович)
        //Секретаря.
        //Создать офис
        //Запустить рабочий день в офисе
        Runner runner = new Runner();
        runner.init();
    }

    /**
     * Для продвинутых
     */
    public static void ex5() {
        //Перевернуть массив(без сторонних классов,методов и стримов), не создавая новый массив.
        // Вывести на экран.
        //"перевернуть" - значит последние элементы становятся первыми и наоборот.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Массив до перевороота: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Массив после \"перевороота\": " + Arrays.toString(numbers));
    }
}
