package lesson150305;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlippingBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // long mask = 0x00000000FFFFFFFFL;
        long tmp;

        int num_of_nums = scanner.nextInt();

        for (int i = 0; i < num_of_nums; i++) {
            tmp = scanner.nextLong();
            System.out.println((~tmp) & 0xFFFFFFFFL);
        }

    }
}
