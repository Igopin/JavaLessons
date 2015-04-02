package lesson150402.polymorphism;

public class Polymorphism {

	static class A {
		
	}
	
	static class B extends A {
	
		@Override
		public String toString() {
		    return "this is B";
		}
	}
	
	static class C extends B {
	
	}
	
	public static void main(String[] args) {
	    B b = new B();
	    
	    A a = b;
	    Object o = a;
	    
	    printObjectDetails(o);
    }

	private static void printObjectDetails(final Object o) {
	    System.out.println(o); //o.toString();
    }
}
