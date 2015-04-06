package lesson150406.exceptions_finaly;

public class FinallyExample2 {

	public static void main(String[] args) {
	    System.out.println("start");
	    
	    try {
	    	a();
	    	//will not executed
	    } catch (Exception e) {
	    	System.out.println(e.getMessage());
	    } finally {
	    	System.out.println("finallys");
	    }
	    
	    System.out.println("finish");
    }

	private static void a() {
		throw new RuntimeException("problem 1");
    }
}
