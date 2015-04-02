package lesson150316;

public class C { //pass reference by value

	private final int _state;
	
	public C(int initialState) {
		_state = initialState;
    
	}
	
	public static void main(String[] args) {

		C c1 = new C(10);
		C c2 = c1;  // copy refernce 
		
		process(c1); //C c = c1
		
		System.out.println(c1._state);
    }

	private static void process(/* final */ C c) {
		
		c = new C(30);
    }
}
