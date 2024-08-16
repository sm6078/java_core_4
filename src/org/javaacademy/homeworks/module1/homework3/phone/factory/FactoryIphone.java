package org.javaacademy.homeworks.module1.homework3.phone.factory;

import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Camera;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Frame;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Processor;
import org.javaacademy.homeworks.module1.homework3.phone.factory.phone.PhoneIphone;

//Создать фабрику Iphone, которая:
//Создает iphone и заполняет его двумя процессорами (1000 Mhz), 8 мегапиксельной камерой,
// и корпусом 60х200х10
public class FactoryIphone {

    public static PhoneIphone doPhoneIphone() {
        PhoneIphone iphone = new PhoneIphone("Iphone",
                new Processor(1000),
                new Frame(60, 200, 10),
                new Camera(8),
                new Processor(1000));
        return iphone;
    }
}
