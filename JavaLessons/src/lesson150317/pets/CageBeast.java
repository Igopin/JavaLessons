package lesson150317.pets;

public class CageBeast extends Pet {

    protected void cleanCage() {
        System.out.println("Cleaning cage for bird");
    }

    @Override
    public void feed() {
        cleanCage();
        super.feed();
    }

}
