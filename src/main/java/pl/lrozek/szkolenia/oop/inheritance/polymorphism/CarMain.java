package pl.lrozek.szkolenia.oop.inheritance.polymorphism;

public class CarMain {

    public static void main( String[] args ) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar();
        car.drive();
    }

}
