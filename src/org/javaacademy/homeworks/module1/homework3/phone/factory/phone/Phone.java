package org.javaacademy.homeworks.module1.homework3.phone.factory.phone;

import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Camera;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Frame;
import org.javaacademy.homeworks.module1.homework3.phone.factory.details.Processor;

public abstract class Phone {
    private final String model;
    private final Camera camera;
    private final Processor processor;
    private final Frame frame;


    public Phone(String name, Processor processor, Frame frame, Camera camera) {
        this.model = name;
        this.processor = processor;
        this.frame = frame;
        this.camera = camera;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Camera getCamera() {
        return camera;
    }

    public void doPhoto() {
        camera.makePhoto();
    }

    @Override
    public String toString() {
        return "Phone{"
                + "model='"
                + model
                + '\''
                + ", camera="
                + camera
                + ", frame="
                + frame
                + ", processor1="
                + processor
                + '}';
    }
}
