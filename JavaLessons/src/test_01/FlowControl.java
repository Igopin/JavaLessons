package test_01;

public class FlowControl {

    public static void main(String[] args) {

        int i = 10;

        {
            System.out.println(i);

            int x = 20;

            System.out.println(x);
        }

        if (i == 10) {
            System.out.println(i);
        }
    }
}
