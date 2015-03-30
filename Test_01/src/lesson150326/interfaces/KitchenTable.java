package lesson150326.interfaces;

public class KitchenTable extends Table {

	@Override
	public void repair() {
		System.out.println("Repairing kitchen table");
	}

	@Override
	public void paint() {
		System.out.println("Painting kitchen table");
	}

}
