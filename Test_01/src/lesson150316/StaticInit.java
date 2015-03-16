package lesson150316;

public class StaticInit {
	
	public static void main(String[] args) {
	    
		SI si;

		System.out.println("start");

		//new SI();
		//System.out.println(SI.x);
		
		SI.test(); // after all static init
    }

}
