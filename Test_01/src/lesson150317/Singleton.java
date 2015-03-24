package lesson150317;

public class Singleton {

	private static Singleton instance = new Singleton();
	// #1
	//final public static Singleton instance = new Singleton();
	
	private Singleton() {
		
		System.out.println("Created new instance!");
		
    }
	
	// #2
	public static Singleton get() {
		return instance;
	}

	// #3
	public static Singleton instance() {
		return instance;
	}

	// #4
	public static Singleton singleton() {
		return instance;
	}
}
