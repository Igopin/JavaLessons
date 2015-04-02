package lesson150317.pets;

public class Service {

	public static void main(String[] args) {
	    
		Cat cat = new Cat();
		Dog dog = new Dog();
		Squirell squirell = new Squirell();
		Parrot parrot = new Parrot();
		Hamster hamster = new Hamster();
		Canary canary = new Canary();
		
		Pet pet = cat;
		Friend friend = cat;
		Object o = cat;
		
		serve(cat);  // Pet pet = cat;
		serve(dog);
		serve(squirell);
		serve(parrot);
		serve(hamster);
		serve(canary);
		
		cat.walk();
		((Cat)o).walk();
		((Friend)pet).walk();
    }

	private static void serve(final Pet pet) {
	    // TODO Auto-generated method stub
	    pet.stroke();
	    pet.feed();
	    pet.wash();
	    pet.brush();
    }
}
