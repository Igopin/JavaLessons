package lesson150331.linked_list.anonymous;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public abstract class D {

    public static D createUpper(final String initialState) {
        return new D(initialState) {

            @Override
            public void doSomething() {
                System.out.println(state.toUpperCase());
            }
        };

    }

    public static D createLower(final String initialState) {
        return new D(initialState) {

            @Override
            public void doSomething() {
                System.out.println(state.toLowerCase());
            }
        };
    }

    // public static D createNatural() {
    // return new D() {
    //
    // @Override
    // public void doSomething() {
    // System.out.println(state);
    // }
    // };
    // }

    String state = "HeLlO";

    public D(final String initialState) {
        state = initialState;
    }

    public static D createNatural(final String initialState) {
        return new D(initialState) {
        };
    };

    public void doSomething() {
        System.out.println(state);
    }

}
