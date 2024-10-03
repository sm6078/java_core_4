package org.javaacademy.homeworks.module2.homework5.ex1;


import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * Вор
 */
public class Thief {
    private BigDecimal money;

    private Thief() {
        this.money = BigDecimal.ZERO;
    }

    private void stealMoney(Bank bank) throws NoSuchFieldException, IllegalAccessException {
        Class<Bank> bankClass = Bank.class;
        Field field = bankClass.getDeclaredField("money");
        field.setAccessible(true);
        Object value = field.get(bank);
        if (!(value instanceof BigDecimal)) {
            throw new RuntimeException("Произошла ошибка. Кража невозможна");
        }
        money = money.add((BigDecimal) value);
        field.set(bank, BigDecimal.ZERO);
    }

    @Override
    public String toString() {
        return "Thief{"
                + "money="
                + money
                + '}';
    }
}