package test_01;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);

            if (nextLine.equals("exit")) {
                break;
            }
        }

        System.out.println("Good bye!");
    }

}
