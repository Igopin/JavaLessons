package lesson150316;

public class UseS {

    public static void main(String[] args) {

        System.out.println(S.s_counter);

        S s = new S();
        S s2 = new S();

        System.out.println(s.counter);
        s.counter = 20;
        System.out.println(s.counter);
        System.out.println(s2.counter);

        // BAD BAD BAD STYLE
        System.out.println(s.s_counter);
        System.out.println(s2.s_counter);

        // MMM.. BETTER
        System.out.println(S.s_counter);
    }

}
