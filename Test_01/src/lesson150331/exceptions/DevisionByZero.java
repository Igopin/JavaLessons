package lesson150331.exceptions;

public class DevisionByZero {

	public static void main(String[] args) {
	    int result;
        try {
	        result = div(100, 10);
        } catch (DeviderIsZero e) {
        	result = Integer.MAX_VALUE;
        	e.printStackTrace();
        }
	    
	    System.out.println(result);
    }

	private static int div(int i, int j) throws DeviderIsZero {
	    
		if (j == 0) {
			throw new DeviderIsZero();
		}
		
		return i / j;
    }
}
