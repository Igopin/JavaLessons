package lesson150406.exceptions_finaly;

public class Finally4 {

	public static void main(String[] args) {
	    System.out.println(a());
    }

	private static int a() {
	    try {
	    	return 20;
	    } finally {
	    	return 10;  // this returned
	    }
    }
}
