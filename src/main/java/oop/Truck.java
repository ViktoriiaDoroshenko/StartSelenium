package oop;

public class Truck extends Car implements Movable {

    private double weight;

    @Override
    public void sendSos() {
        System.out.println("SOS from truck");
    }
}
