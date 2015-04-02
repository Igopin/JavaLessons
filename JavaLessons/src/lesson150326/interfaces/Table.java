package lesson150326.interfaces;

public abstract class Table extends Furniture {

	@Override
	public void move() {
		System.out.println("Moving table.");
	}

	@Override
	public void clean() {
		System.out.println("Cleaning table.");
	}
}
