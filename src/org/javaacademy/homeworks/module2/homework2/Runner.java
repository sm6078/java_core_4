package org.javaacademy.homeworks.module2.homework2;

import java.io.IOException;
import org.javaacademy.homeworks.module2.homework2.ex1.space.LuggageSpace;
import org.javaacademy.homeworks.module2.homework2.ex2.Customs;

public class Runner {
    private static final String FILE_NAME = "luggage.csv";

    public static void main(String[] args) throws IOException {
        ex1();
        System.out.println("__________");
        ex2();
    }
    /**
     * 1. Задание: Грузчики в Болгарии
     *         В аэропорт Болгарии прилетает самолет. В самолете багаж.
     *         На выгрузной ленте может находиться не больше 10 чемоданов.
     *         Задача: разгрузить багажное отделение самолета,
     *         загружая на ленту не более 10 чемоданов.
     *         Примечание: багаж должен отдаваться в том же порядке, в котором попадал на ленту.
     *         Т.е нужно создать функцию, в которую приходит имя файла(это прибывший багаж).
     *         От туда будет считываться порциями по 10 штук багаж.
     *         Этот багаж перемещается на ленту.
     *         Печатается: Начинается загрузка на ленту
     *         После того как лента заполнена или больше нет чемоданов:
     *         Печатается: Лента загружена, начинается выдача багажа.
     *         Лента включается и с нее пропадают чемоданы.
     *         Печатается на экран: {Номер багажа} - выдан
     *         После окончания выдачи печатается: Лента пустая, закончена выдача багажа
     *         Т.е. прибыл багаж (файл luggage.csv).
     *         Там находится 20 чемоданов(номера от 1 до 20) . На экране будет выведено:
     *         Начинается загрузка на ленту
     *         Лента загружена, начинается выдача багажа
     *         1 - выдан
     *         2 - выдан
     *         ....
     *         10 - выдан
     *         Лента пустая, закончена выдача багажа
     *         Начинается загрузка на ленту
     *         Лента загружена, начинается выдача багажа
     *         11 - выдан
     *         12 - выдан
     *         ....
     *         20 - выдан
     *         Лента пустая, закончена выдача багажа
     *         Протестировать функцию на файле luggage.csv.
     */

    public static void ex1() throws IOException {
        LuggageSpace luggageSpace = new LuggageSpace();
        luggageSpace.unloading(FILE_NAME);
    }

    /**
     * 2. Задание: Таможня в Болгарии
     *         Таможня собирает статистику о весе ввезенных чемоданов.
     *         Есть 3 категории чемоданов: легкий (до 5 кг),
     *         средний (от 5 кг до 10кг), тяжелый (от 10 кг)
     *         Необходимо создать функцию, которая:
     *         считывает файл с багажом, суммирует вес по каждой категории
     *         и возвращает сгруппированные данные
     *         т.е функция должна вернуть данные (не распечатать), в которых будет инфо:
     *         категория чемодана - сумма всех чемоданов этой категории
     *         Пример возврата:
     *         легкий - 205
     *         средний - 513
     *         тяжелый - 1200
     *         Протестировать функцию на файле luggage.csv.
     */
    public static void ex2() throws IOException {
        Customs customs = new Customs();
        System.out.println(customs.getStatisticsByBaggageWeight(FILE_NAME));
    }
}
