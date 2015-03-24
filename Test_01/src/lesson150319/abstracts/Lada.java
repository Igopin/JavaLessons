package lesson150319.abstracts;

public final class Lada extends Car {

	@Override
	public void moveTo(int x, int y) {
		
		turnOn();
		
		while (notBroken()) {
			drive();
			repair();
		}
			shutDown();
	}

}
