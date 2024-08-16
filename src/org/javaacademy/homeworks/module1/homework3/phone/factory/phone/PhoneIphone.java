package org.javaacademy.homeworks.module1.homework3.phone.factory.phone;

import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Camera;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Frame;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Processor;

//Создать телефон Iphone, который состоит из двух процессоров, камеры, корпуса.
//Умеет фотографировать используя камеру (печать в консоль - "сделано фото").
//Умеет печатать на экран информацию о процессорах.
public class PhoneIphone extends Phone {
    private final Processor processorTwo;

    public PhoneIphone(String name, Processor processor, Frame frame,
                       Camera camera, Processor processorTwo) {
        super(name, processor, frame, camera);
        this.processorTwo = processorTwo;
    }

    public void printProcessorInfo() {
        System.out.println("Информация о процессоре 1: " + super.getProcessor().frequency);
        System.out.println("Информация о процессоре 2: " + processorTwo.frequency);
    }

    public void doPhoto() {
        super.doPhoto();
    }

    @Override
    public String toString() {
        return super.toString()
                + "processor2=" + processorTwo
                + '}';
    }
}
