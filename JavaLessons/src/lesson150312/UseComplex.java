package lesson150312;

public class UseComplex {
	
	public static void main(String[] args) {
		Complex complex = new Complex(100);
		
		complex.reportState();
		
		complex.change(50);
		
		complex.reportState();
	
//		complex.a = 30000; FuThSh!
//		complex.incA(100);
//		complex.incB(100);
		
		complex.change(1000);
		
		complex.reportState();
    }

}
