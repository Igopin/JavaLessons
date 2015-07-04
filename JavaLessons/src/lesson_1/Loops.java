package lesson_1;

public class Loops {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3 };

        printArray(a);
    }

    private static void printArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            System.out.println(x);
            a[i] = 0;
        }

        for (int x : a) {
            System.out.println(x);
        }
    }
}
