package lesson150317;

public class LazySingleton {

	private static LazySingleton instance;
	
	private LazySingleton() {
		
	}
	
	public LazySingleton get() {
		
		if (instance == null) {
			instance = new LazySingleton(); // lazy init
		}
		
		return instance;
	}
}
