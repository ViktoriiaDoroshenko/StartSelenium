package oop;

import oop.SportCar;

public class Formula1 extends SportCar implements Movable, Saleable {

    private double length;

    @Override
    public void sendSos() {
        System.out.println("Sending SOS signal from oop.Formula1");

    }
}
