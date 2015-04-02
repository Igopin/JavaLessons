package lesson150323.static_hiding;

public class Use {

	public static void main(String[] args) {
	    A a = new A();
	    a.getCount(); 
	    
	    A a2 = new B();
	    a2.getCount();
//	    A.getCount();
	    
	    B b = new B();
	    b.getCount();
//	    B.getCount();
	    
	    
    }
}
