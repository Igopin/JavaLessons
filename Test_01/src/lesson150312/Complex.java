package lesson150312;

public class Complex {
	
	// protected only heirs (or same package)
	// default (package) friends (same package ) 
	
	private int a, b;
	int c;
	
	public Complex(int initialValue ) {
		a = 0;
		b = initialValue;
	}
	
	public void change(int delta) {
		incA(delta);
		incB(delta);
	}

	void someMethod(){
		// do something
	}
	
	protected void ovverrideMe() {
	    
    }
	
	private int incA(int delta) {
	    return a += delta;
    }

	private int incB(int delta) {
	    return b -= delta;
    }
	
	public void reportState() {
		System.out.println("a = " + a + ", b = "+  b);
    }

}
