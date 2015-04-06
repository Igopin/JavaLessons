package lesson150406.exceptions;

public class UseStack {
	
	public static void main(String[] args) {
	    Stack stack = new Stack(3);
	    
	    try {
	        stack.pop();
        } catch (StackEmptyException e1) {
	        e1.printStackTrace();
        }
	    
	    try {	    	
		    stack.push("one");
		    stack.push("two");
		    stack.push("three");
		    stack.push("four"); //out of index
	    } catch(Exception e) {
	    	System.out.println(e);
	    }
	    
	    while (!stack.isEmpty()){
	    	try {
	            System.out.println(stack.pop());
            } catch (StackEmptyException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
            }
	    }
    }

}
