package org.javaacademy.homeworks.module1.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void checkShop(Shop shop) {
        if (shop.isClearFloor() && shop.isWorkersHasBadge()
                || (shop.isClearFloor() && shop.getCountWorkers() > 2)
                || (shop.isWorkersHasBadge() && shop.getCountWorkers() > 2)
        ) {
            System.out.println(name + ": Магазин прошел проверку");
        } else {
            System.out.println(name + ": Магазин не прошел проверку!");
        }
    }
}
