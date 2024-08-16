package org.javaacademy.homeworks.module1.homework3.phone.factory.phone;

import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Camera;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Frame;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Processor;

//Создать телефон Samsung, который состоит из процессора, камеры, корпуса.
//Умеет фотографировать используя камеру (печать в консоль - "сделано фото")
//
public class PhoneSamsung extends Phone {

    public PhoneSamsung(String name, Processor processor, Frame frame, Camera camera) {
        super(name, processor, frame, camera);
    }

    public void doPhoto() {
        super.doPhoto();
    }
}
