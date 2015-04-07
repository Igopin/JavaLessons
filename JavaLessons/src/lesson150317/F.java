package lesson150317;

public class F extends E {

    int stateF = 20;

    {
        System.out.println("Init F!");
        System.out.println(stateE + ", " + stateF);
    }

    public F() {
        super(1224234);
        System.out.println("Construct F");
    }

    public static void main(String[] args) {
        F f = new F();
    }
}
