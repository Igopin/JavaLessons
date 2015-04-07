package lesson150305;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LonleyInteger {

    static int lonelyinteger(int[] a) {
        return 0;
    }

    private static void maxXor(int l, int r) {

        int tmp, max = 0;
        for (int i = l; i <= r; i++) {
            for (int j = l; j <= r; j++) {
                if (i > j) {
                    continue;
                }
                if ((tmp = i ^ j) > max) {
                    max = tmp;
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int a[] = new int[10];

        System.out.println(a[7]);
        int l = 10, r = 15;
        maxXor(l, r);

    }

}
