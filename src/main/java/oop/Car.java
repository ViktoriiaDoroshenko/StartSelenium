package oop;

public class Car {
    // characteristics - fields - properties - data members

    private double engine; // 8 bytes
    private int year; // 4 bytes
    private boolean electric; // 1 byte
    private String [] colors; // 8 byte
    private int  colorCode; // 4 byte
    private String brand = "HONDA"; // 8 bytes
    private String model; // 8 bytes

    private double price;


    //behaviour - methods
    //1.object non static
    public void toDrive(){
        System.out.println("Driving");

    }
    public void toStop(){
        System.out.println("Stopping");
    }
    // 2. class static
    public static void fire(){
        System.out.println("Fire figthing");
    }
    public static void fire(int a){
        System.out.println("Fire figthing");
    }
    public static void fire(double b){
        System.out.println("Fire figthing");
    }
    // type + name + type parameter = signature
    //public abstract void absMethod();
// constructor
    // 1. default constructor
    public Car(){
    }
public Car(int year){
this.year = year;
}

    public Car(double engine, boolean electric, int colorCode, String model) {
        this.engine = engine;
        this.electric = electric;
        this.colorCode = colorCode;
        this.model = model;
    }

    public Car(double engine, int year, int colorCode, String model) {
       // this.engine = engine;
        setEngine(engine);
        if(year < 1900 ) {
            return;} else {
            this.year = year;
        }
        this.colorCode = colorCode;
        this.model = model;
    }

    public void setEngine(double engine) {
       if(engine < 0) return;
       this.engine = engine;
    }
    public Car withEngine(double engine) {
       if(engine < 0) return this;
       this.engine = engine;
       return this;
    }

    public void setYear(int year) {
        if(year<2000) return;
        this.year = year;
    }
    public Car withYear(int year) {
        if(year<2000) return this;
        this.year = year;
        return this;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public boolean isElectric() {
        return electric;
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "oop.Car{" +
                "engine=" + engine +
                ", year=" + year +
                ", electric=" + electric +
                ", colorCode=" + colorCode +
                ", brand=" + brand  +
                ", model=" + model  +
                ", price=" + price +
                '}';
    }



}
