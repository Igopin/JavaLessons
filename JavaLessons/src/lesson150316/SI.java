package lesson150316;

public class SI {

    public void changeState() {

    }

    static {
        System.out.println("init 1");
    }

    static int x;

    static {
        x = 10;

        System.out.println("static init: " + x);
    }

    static {
        System.out.println("init 3");
    }

    static void test() {
        System.out.println("this is SPAARTAAAA!1111!1!11!");
    }

    static {
        System.out.println("init 2");
    }

}
