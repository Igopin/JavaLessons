package lesson150326.interfaces;

public class SurgeryTable extends Table {

	@Override
	public void repair() {
		System.out.println("Repairing surgery table");
	}

	@Override
	public void paint() {
		System.out.println("Painting surgery table");
	}

}
