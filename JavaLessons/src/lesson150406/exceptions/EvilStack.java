package lesson150406.exceptions;

public class EvilStack extends Stack {

	public EvilStack(final int capacity) {
	    super(capacity);
    }

	@Override
	public void push(Object item) {

		System.out.println("haha!");
	    try {
	        super.push(item);
        } catch (StackFullException e) {
        	//shit
        }
	}
	
	@Override
	public Object pop() {
	    try {
	        return super.pop();
        } catch (StackEmptyException e) {
        	return null;
        }
	}
}
