package org.javaacademy.homeworks.module1.homework3;

import org.javaacademy.homeworks.module1.homework3.ex3.Pyramid1;
import org.javaacademy.homeworks.module1.homework3.ex4.City;
import org.javaacademy.homeworks.module1.homework3.ex4.House;
import org.javaacademy.homeworks.module1.homework3.phone.factory.FactoryIphone;
import org.javaacademy.homeworks.module1.homework3.phone.factory.FactorySamsung;
import org.javaacademy.homeworks.module1.homework3.phone.factory.phone.PhoneIphone;
import org.javaacademy.homeworks.module1.homework3.phone.factory.phone.PhoneSamsung;

public class Runner {
    public static void main(String[] args) {
        ex1();
        System.out.println("____________________________");
        ex2();
        System.out.println("____________________________");
        ex3();
        System.out.println("____________________________");
        ex4();
    }

    public static void ex1() {
        org.javaacademy.homeworks.module1.homework3.shop.Runner.main(null);
    }

    //Задача: Фабрика телефонов
    //Организовать фабрику создания двух телефонов
    //ВНИМАНИЕ! Фабрики создают телефоны без создания экземпляра фабрики!
    //
    //Создать телефон Iphone, который состоит из двух процессоров, камеры, корпуса.
    //Умеет фотографировать используя камеру (печать в консоль - "сделано фото").
    //Умеет печатать на экран информацию о процессорах.
    //
    //Создать телефон Samsung, который состоит из процессора, камеры, корпуса.
    //Умеет фотографировать используя камеру (печать в консоль - "сделано фото")
    public static void ex2() {
        final PhoneIphone iphone = FactoryIphone.doPhoneIphone();
        final PhoneSamsung samsung = FactorySamsung.doPhoneSamsung();
        System.out.println(iphone.toString());
        iphone.doPhoto();
        iphone.printProcessorInfo();
        System.out.println("-->");
        System.out.println(samsung.toString());
        samsung.getCamera().makePhoto();
    }

    //Задача: Пирамида наследования
    //Создать классы Pyramid1, Pyramid2, Pyramid3.
    //НЕОБХОДИМО НАСЛЕДОВАНИЕ С ИСПОЛЬЗОВАНИЕМ РОДИТЕЛЬСКИХ МЕТОДОВ!
    // Создать метод print, который будет выводить следующий текст:
    // M <- из Pyramid1
    // MM <- из Pyramid2
    // MMM <- из Pyramid3

    //Т.е. при вызове pyramid1.print выведется:
    // M
    // MM
    // MMM

    //при вызове pyramid2.print выведется:
    // MM
    // MMM

    //при вызове pyramid3.print выведется:
    // MMM

    //создать здесь экземпляр класса pyramid1 и вызвать print
    public static void ex3() {
        Pyramid1 pyramid1 = new Pyramid1();
        pyramid1.print();
    }

    /**
     * Для продвинутых
     */
    //Зада: Иммутабельный город.
    //
    //Создать класс House (наименование улицы, номер дома) - создать сеттеры! и геттеры на него.
    //Переопределить вывод в текст - вывод улицы и номера дома
    //Создать иммутабельный класс City (наименование города, и массив домов).
    //Переопределить вывод в текст - чтобы выводило имя города, и все дома
    //
    //1. Создать два дома, создать город с массивом созданных домов
    //2. Сделать так, чтобы у города нельзя было поменять свойства.
    //3. Сделать так, что если дом получен из города, то при изменении свойств этого дома,
    // эти изменения не затронут дом находящийся внутри города.
    // Т.е. результат должен соответствовать псевдокоду ниже:
    //
    //[] - квадратные скобки - массив
    //{} - объект
    // City city = new City([{new House('Lenina', 1)}], "Мурманск");
    // System.out.println(city);
    //-- City{[House{street: Lenina, house: 1}], name: "Мурманск"}
    //House house = city.getHouses()[0];
    //house.setStreet('Kotova');
    //System.out.println(house);
    //-- House{street: Kotova, house: 1}
    //System.out.println(city);
    //-- City{House{street: Lenina, house: 1}}
    public static void ex4() {
        House house1 = new House("проспект Ленина", "1Б");
        House house2 = new House("Краснопутиловская ул.", "114");
        City city = new City("Мурманск", new House[]{house1, house2});
        System.out.println(city.toString());
        House house = city.getHouses()[0];
        house.setStreetName("Котова");
        System.out.println(city);
    }
}
