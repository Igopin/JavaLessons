package lesson150316;

public class UseD {

	public static void main(String[] args) {
	    D d = D.create(50, 50);
	    
	    System.out.println(d.getX() + " , " + d.getY());
	    
	    D d2 = D.create(30, 40);
	    
	    System.out.println(d2);
	    
	    //D d3 = new D(100, 200); private constructor
		
    }
}
