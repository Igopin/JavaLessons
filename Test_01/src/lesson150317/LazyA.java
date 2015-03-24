package lesson150317;

public class LazyA {  //Liskov Substitution Principle is broken
	
	int state;
	
	public void change() {
		state += 2;
	}
	
	public int get() {
		return state;
	}

}
