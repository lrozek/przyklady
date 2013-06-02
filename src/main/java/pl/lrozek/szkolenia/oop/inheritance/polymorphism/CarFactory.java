package pl.lrozek.szkolenia.oop.inheritance.polymorphism;

public class CarFactory {

    public Car createCar() {
        return new Porshe();
    }

}
