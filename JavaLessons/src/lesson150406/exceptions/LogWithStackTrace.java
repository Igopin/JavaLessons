package lesson150406.exceptions;

public class LogWithStackTrace {
	
	//log library: log4j
	
	public static void log(final String message) {
		Exception e = new Exception(); // not good... but...

		System.out.println(e.getStackTrace()[1].getMethodName() + ":" + message);
	}
	
	public static void main(String[] args) {
	    log("message 1");
	    a();
	    b();
    }
	
	private static void a() {
	    log("here");	    
    }

	private static void b() {
	    log("here");
    }
}
