package org.javaacademy.homeworks.module1.homework1;

import java.math.BigDecimal;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
    }

    //Дана строка
    //String name = "     ПЕтРов Олег Иванович     ";
    //Необходимо
    //1. убрать лишние пробелы,
    //2. перевести текст в верхний регистр
    //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
    // Если содержит "ов " то печатаем на экран: Уважаемый {name}
    // В иных случаях печатаем на экран: Неизвестное лицо {name}
    public static void ex2() {
        String name = "     ПЕтРов Олег Иванович     ";

        String resultName = name.trim().toUpperCase();
        String[] arrStr = resultName.split(" ");
        String sexDeterminant = arrStr[0].substring(arrStr[0].length() - 3);
        if (sexDeterminant.contains("ОВА")) {
            System.out.println("Уважаемая " + resultName);
        } else if (sexDeterminant.contains("ОВ")) {
            System.out.println("Уважаемый " + resultName);
        } else {
            System.out.println("Неизвестное лицо " + resultName);
        }
    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (
                fuel >= 10 && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        //Работа на самостоятельное изучение функций класса String.
        //Заменить в строке 'this is' на 'those are',
        //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        System.out.println("Исходная строка:" + simply);
        String result = simply.replace("this is", "those are");
        System.out.println("Резльтат преобразования: " + result);
        System.out.println("Индекс (число) второй буквы 'o' в строке: "
                + result.indexOf("o", result.indexOf("o") + 1));
    }

    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */
    //Задача №4
    //Компания Рога и Копыта производит мясные продукты.
    //Перечень производимых товаров :
    //Колбаса - стоимость(цена) 800 руб,
    //себестоимость при производстве меньше 1000 кг - 412руб,
    //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
    //себестоимость при производстве от 2000 - 404 руб

    //Ветчина - стоимость 350 руб
    //себестоимость при производстве - 275 руб

    //Шейка - стоимость 500 руб
    //себестоимость при производстве меньше 500кг - 311 руб
    //себестоимость при производстве больше или равно 500кг - 299 руб

    //Финансовые показатели
    //Доход компании считается как умножение стоимости на количество проданных кг
    //Расход компании считается как умношение себестоимости на
    // количество проданных кг + миллион рублей
    //Прибыль до налогов считается как: доход - расход
    //Налоги считаются так:
    // прибыль до налогов больше 2_000_000, облагается ставкой 13%
    // прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
    // прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
    //пример расчета налогов для прибыли до налогов 2_500_000:
    //1_000_000 - налог 80_000 - по ставке 8%
    //1_000_000 - налог 100_000 - по ставке 10%
    //500_000 - 65_000 - по ставке 13%
    //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
    //Прибыль после налогов: прибыль до налогов - налог.

    //Необходимо создать универсальную систему расчетов прибыли после налогов,
    //Т.е на вход подаются данные по количеству произведенных продуктов
    // и печатается прибыль после налогов компании
    //Узнать прибыль после налогов, при продаже:
    //Колбасы 2000кг - это произведено и продано
    //Ветчины 8511кг - это произведено и продано
    //Шейки 6988кг - это произведено и продано
    public static void advanced() {
        BigDecimal sausageCost = new BigDecimal(800);
        BigDecimal hamCost = new BigDecimal(350);
        BigDecimal neckCost = new BigDecimal(500);
        int inputCountSausage = 2000;
        int inputCountHam = 8511;
        int inputCountNeck = 6988;

        BigDecimal income = sausageCost.multiply(new BigDecimal(inputCountSausage))
                .add(hamCost.multiply(new BigDecimal(inputCountHam)))
                .add(neckCost.multiply(new BigDecimal(inputCountNeck)));

        BigDecimal costPriceSausage = getCostPriceSausage(inputCountSausage);
        BigDecimal costPriceHam = new BigDecimal(inputCountHam * 275);
        BigDecimal costPriceNeck = inputCountNeck >= 500
                ? new BigDecimal(inputCountNeck * 299)
                : new BigDecimal(inputCountNeck * 311);

        BigDecimal rate = costPriceSausage.add(costPriceHam)
                .add(costPriceNeck).add(new BigDecimal(1_000_000));
        BigDecimal profit = income.subtract(rate);

        profit = profit.subtract(calculateTask(profit));
        System.out.println("Прибыль после налогов уплаты: " + profit);
    }

    private static BigDecimal getCostPriceSausage(int countSausage) {
        BigDecimal sum = new BigDecimal(0);
        if (countSausage >= 2000) {
            sum = sum.add(new BigDecimal(countSausage * 404));
        } else if (countSausage >= 1000) {
            sum = sum.add(new BigDecimal(countSausage * 408));
        } else {
            sum = sum.add(new BigDecimal(countSausage * 412));
        }
        return sum;
    }

    private static BigDecimal calculateTask(BigDecimal money) {
        BigDecimal task = new BigDecimal(0);
        BigDecimal firstTaxLimit = new BigDecimal(1_000_000);
        BigDecimal secondTaxLimit = new BigDecimal(2_000_000);
        BigDecimal percentageTaxRateOne = new BigDecimal("0.08");
        BigDecimal percentageTaxRateTwo = new BigDecimal("0.1");
        BigDecimal percentageTaxRateThree = new BigDecimal("0.013");

        if (money.compareTo(firstTaxLimit) <= 0) {
            task = task.add(money.multiply(percentageTaxRateOne));
        } else if (money.compareTo(firstTaxLimit) > 0 && money.compareTo(secondTaxLimit) <= 0) {
            task = money.subtract(firstTaxLimit).multiply(percentageTaxRateTwo);
            BigDecimal temporary = firstTaxLimit.multiply(percentageTaxRateOne);
            task = task.add(temporary);
        } else {
            BigDecimal temporaryOne = firstTaxLimit.multiply(percentageTaxRateOne);
            BigDecimal temporaryTwo = firstTaxLimit.multiply(percentageTaxRateTwo);
            task = task.add(money.subtract(secondTaxLimit.multiply(percentageTaxRateThree)));
            task = task.add(temporaryOne).add(temporaryTwo);
        }
        return task;
    }
}
