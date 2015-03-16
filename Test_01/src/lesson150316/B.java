package lesson150316;

public class B {
	
	int state = 0;
	
	public static void main(String[] args) {
	    
		int x = 20;
		
		something(x);
		
		{
			int xx = x;
			
			xx = 30;
			
			System.out.println(xx);
		}
		
		System.out.println(x);
    }

	private static void something(int x) {
		x = 30;
		
		System.out.println(x);
    }
} 