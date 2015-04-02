package lesson150330.innerexample;

public class Dog {

	private interface BrainState {
		void stroke();
		void feed();
	}
	
	
	// design pattern - strategy
	
	private class Evil implements BrainState {

		@Override
        public void stroke() {
	        bite(); // Dog.this.bite();
        }

		@Override
        public void feed() {
	        Dog.this.state = Dog.this.new Good(); // Dog.this.feed();
	        bark();
        }
		
	}
	
	private class Good implements BrainState {

		int count;
		
		@Override
        public void stroke() {
			wag();
			count++;
			if (count > 3) {
				state = new Evil();
			}
		}

		@Override
        public void feed() {
			wag();
			wag();
			count = 0;
        }
		
	}
	
	BrainState state;
	
	public Dog() {
		state = new Evil();
	}
	

	public void stroke() {
		state.stroke();
					
	}
	
	public void feed() {
		state.feed();
	}
	public void bark() {
		System.out.println("Bark!");
	}
	
	private void wag() {
		System.out.println("WAW!");
	}
	
	private void bite() {
		System.out.println("PREPARE your ANUS!");
	}
}
