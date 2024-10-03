package org.javaacademy.homeworks.module2.homework5.ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Runner {
    private static final BigDecimal COUNT_MONEY = new BigDecimal(1500);


    /**
     * Запрещено изменять модификаторы доступа!
     * Практически все будет через рефлексию
     * Создать банк с 1500 денег
     * Создать вора
     * Дописать метод stealMoney у вора так, чтобы он крал все деньги из банка себе
     * (увеличивал у себя деньги и обнулял деньги банка)
     * Вызвать здесь метод stealMoney
     * Распечатать вора и банк
     * Итог:
     * Вор - 1500 денег
     * Банк - 0 денег
     */
    public static void main(String[] args) throws InvocationTargetException,
            NoSuchMethodException, InstantiationException, IllegalAccessException {
        Bank bank = createBank(COUNT_MONEY);
        Thief thief = createThief();
        System.out.println("______before theft______");
        System.out.println(bank);
        System.out.println(thief);
        stealMoney(thief, bank);
        System.out.println("______after theft______");
        System.out.println(bank);
        System.out.println(thief);
    }

    private static Bank createBank(BigDecimal money) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Constructor<Bank> bankConstructor = bankClass.getDeclaredConstructor(BigDecimal.class);
        bankConstructor.setAccessible(true);
        return bankConstructor.newInstance(money);
    }

    private static Thief createThief() throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Constructor<Thief> thiefConstructor = thiefClass.getDeclaredConstructor();
        thiefConstructor.setAccessible(true);
        return thiefConstructor.newInstance();
    }

    private static void stealMoney(Thief thief, Bank bank)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Thief> thiefClass = Thief.class;
        Method methodSay = thiefClass.getDeclaredMethod("stealMoney", Bank.class);
        methodSay.setAccessible(true);
        methodSay.invoke(thief, bank);
    }
}
