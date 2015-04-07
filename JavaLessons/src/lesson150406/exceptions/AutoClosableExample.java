package lesson150406.exceptions;

import java.util.Scanner;

public class AutoClosableExample {

    static class MyResource implements AutoCloseable {

        {
            System.out.println("create my resource");
        }

        public void process() {
            System.out.println("processing");
        }

        @Override
        public void close() {
            System.out.println("close my resource");
        }

    }

    public static void main(String[] args) {

        try (MyResource r = new MyResource()) {
            r.process();
        }

        // try (Scanner scanner = new Scanner(System.in)) {
        // String line = scanner.nextLine();
        // System.out.println(line);
        // }

        Scanner scanner = new Scanner(System.in);
        try {
            String line = scanner.nextLine();
            System.out.println(line);
        } finally {
            scanner.close();
        }

    }
}
