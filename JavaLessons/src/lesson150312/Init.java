package lesson150312;

public class Init {
	
	int i = 10; // #1
	
	// #2
	{
		System.out.println("initiliazer start i  = " + i);
		i = 30;
		System.out.println("initiliazer end i = " + i);
	}

	// #4
	public Init() {
		System.out.println("constructor start " + i);
		i = 20;
		System.out.println("constructor end " + i);
	}
	
	// #5
	public static void main(String[] args) {
	    Init init = new Init();
	    
	    System.out.println(init.i);
    }

	// #3
	{
		System.out.println("another init");
		i = 50;
	}

}
