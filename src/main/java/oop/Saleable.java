package oop;

public interface Saleable {

    default void toSale(){
        System.out.println("I am selling");
    }
}
