package lesson150323.static_hiding;

public class B extends A {

    public static int getCount() {
        System.out.println("from B");
        return 0;
    }
}
