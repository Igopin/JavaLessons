package lesson150319.abstracts;

public class Audi extends Car {

    @Override
    public void moveTo(int x, int y) {
        turnOn();
        drive();
        shutDown();
    }

}
