package lesson150323.inheritance;

import lesson150319.abstracts.Car;

public class FantomasCar extends Car {

	@Override
	public void moveTo(int x, int y) {
		System.out.println("moving quick");
	}
	
	public void flyTo() {
		System.out.println("flying	");
    }
}
