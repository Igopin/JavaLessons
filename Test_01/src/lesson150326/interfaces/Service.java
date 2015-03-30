package lesson150326.interfaces;

public class Service {
	public static void main(String[] args) {
		
	    Furniture[] things = {new Chair(), new SurgeryTable(), new KitchenTable()};
	    
	    serve(things);
	    clean(new Cleanable[] {new Cat(), new Chair(),
	    		new KitchenTable(), new Multiplier()});
    }

	private static void clean(Cleanable[] things) {
	    
		for (Cleanable somethig : things){
			somethig.clean();
		}
    }

	private static void serve(Furniture[] things) {
		for (Furniture furniture : things){
			furniture.move();
			furniture.clean();
			furniture.move();
		}
    }
}
