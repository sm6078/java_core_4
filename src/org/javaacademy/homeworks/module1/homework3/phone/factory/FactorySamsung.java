package org.javaacademy.homeworks.module1.homework3.phone.factory;

import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Camera;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Frame;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Processor;
import org.javaacademy.homeworks.module1.homework3.phone.factory.phone.PhoneSamsung;

//Создать фабрику Samsung, которая:
//Создает samsung и заполняет его процессором (1500 Mhz), 16 мегапиксельной камерой,
// и корпусом 60х200х15
public class FactorySamsung {

    public static PhoneSamsung doPhoneSamsung() {
        PhoneSamsung samsung = new PhoneSamsung("Samsung",
                new Processor(1500),
                new Frame(60, 200, 15),
                new Camera(16));
        return samsung;
    }
}
