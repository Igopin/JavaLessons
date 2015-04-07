package lesson150406.exceptions_finaly;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.management.RuntimeErrorException;

public class FinallyExamples {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock(); // mutex
        lock.lock();
        try {
            doSomething();
        } finally {
            lock.unlock();
            System.out.println("unlocked!");
        }
        System.out.println("finish");

    }

    private static void doSomething() {
        throw new RuntimeException();
    }
}
