package lesson150514.jmock;

public class PetService {

    public void serve(final Pet pet) {
        pet.feed();
        pet.sroke();
        pet.wash();
        pet.walk();
    }

    
}
