package lesson150319.abstracts;

import java.util.Arrays;
import java.util.Iterator;

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        System.out.println(Arrays.toString(vehicles));

        vehicles[0] = new Lada();
        vehicles[1] = new Audi();
        vehicles[2] = new Horse();

        for (Vehicle vehicle : vehicles) {
            vehicle.moveTo(100, 100);
        }
    }
}
