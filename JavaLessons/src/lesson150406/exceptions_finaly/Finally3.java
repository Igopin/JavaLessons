package lesson150406.exceptions_finaly;

public class Finally3 {

	public static void main(String[] args) {
	    try {
	        a();
        } catch (Exception e) {
        	e.printStackTrace();
        	e.getCause().getMessage();
        }
    }

	private static void a() throws Exception {
	    
		System.out.println("open resource");
		
		try {
			// do shit
			b();
			System.out.println("after b");
		} catch (Exception e) {
			System.out.println("catched exception " + e.getMessage());
			throw new Exception(e);
		} finally {
			System.out.println("close resource");
		}
		// close ???? - will not be executed!
		System.out.println("close re.... wat da fuck, this never...");
    }

	private static void b() {
	    throw new RuntimeException("trouble");
    }
}
