package lesson150317;

public class A {

    int state;

    public void change() {
        System.out.println("change of A");
        state++;
    }

    public int get() {
        return state;
    }

}
