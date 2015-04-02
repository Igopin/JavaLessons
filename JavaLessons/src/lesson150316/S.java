package lesson150316;

public class S {

	public static int s_counter; // class member
	
	public int counter = 10; // instance member

	{
		s_counter++;
	}
	
	public S() {
		
	}
	
	public S(final int c) {
		counter = c;
	}
	
}
