package lesson150331.local;

import lesson150326.interfaces.Cleanable;

public class A {

    public Cleanable[] doSomething() {

        return new Cleanable[] { new Cleanable() {
            @Override
            public void clean() {
                System.out.println("cleaning Alien");
            }
        }, new Cleanable() {
            @Override
            public void clean() {
                System.out.println("cleaning Predator");
            }
        }, new Cleanable() {

            @Override
            public void clean() {
                System.out.println("cleaning Terminator");
            }
        } };

    }
}
