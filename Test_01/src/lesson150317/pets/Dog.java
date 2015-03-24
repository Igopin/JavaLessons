package lesson150317.pets;

public class Dog extends Friend {
	@Override
	public void wash() {
		whistle();
		super.wash();
	}

	private void whistle() {
		System.out.println("Whistling DOOOOG");
    }
}
