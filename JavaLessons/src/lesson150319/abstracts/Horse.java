package lesson150319.abstracts;

public class Horse extends Vehicle {
	
	public Horse() {
		super();
		
		// Vehicle v = new Vehicle();
	}
	
	@Override
	public void moveTo(int x, int y) {
		
		for (int i = 0; i < 10; i++) {
	        System.out.println("тыгыдм-тыгыдым");
        }
		System.out.println("и прискакал!");
	}

}
