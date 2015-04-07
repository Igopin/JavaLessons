package lesson150331.local;

import lesson150326.interfaces.Cleanable;

public class Alocal {

    public Cleanable[] getHeroes() {

        class PetHero implements Cleanable {

            private String name;

            public PetHero(String name) {
                this.name = name;
            }

            @Override
            public void clean() {
                System.out.println("cleaning " + name);
            }

        }

        return new Cleanable[] { new PetHero("Alien"), new PetHero("Predator"),
                new PetHero("Terminator") };
    }

    public static void main(String[] args) {
        Alocal a = new Alocal();

        Cleanable[] cleanable = a.getHeroes();

        for (Cleanable pet : cleanable) {
            pet.clean();
        }
    }
}
