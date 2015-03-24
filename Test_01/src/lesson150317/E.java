package lesson150317;

public class E {
	
	int stateE = 10;
	
	{
		System.out.println("Init E");
	}
	
//	public E() {
//		super();
//		System.out.println("Construct E");
//	}

	public E(final int initialState) {
		super(); // FIRST
		stateE = initialState;
		System.out.println("Construct E with param");
	}
}
