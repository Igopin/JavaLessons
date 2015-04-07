package lesson150317;

public class Y extends X {

    @Override
    public void change() {
        System.out.println("start changeY");
        // super.change();
        System.out.println("start");
        this.other();
        super.other();

    }

    @Override
    public void other() {
        System.out.println("otherY");
    }

    public static void main(String[] args) {

        Y y = new Y();

        y.change();
    }

}
