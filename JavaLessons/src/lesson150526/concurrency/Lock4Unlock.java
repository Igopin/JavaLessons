package lesson150526.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.Utils;

public class Lock4Unlock {

    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        
        new Thread(new Runnable() {
            
            @Override
            public void run() {
                lock.lock();
                try {
                    while (true) {
                        // haha!
                    }
                } finally {
                    lock.unlock();
                }
            }
        }).start();
        
        Utils.pause(1000);
        
        Thread hatiko = new Thread(new Runnable() {
            
            @Override
            public void run() {
                boolean success = false;
                try {
                    success = lock.tryLock(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    System.out.println("interupted, leaving now");
                    return;
                }
                if (!success) {
                    System.out.println("task is busy!");
                    return;
                }
                try {
                    System.out.println("Hehe!");
                } finally {
                    lock.unlock();
                }
            }
        });
        
        hatiko.start();
        //Utils.pause(1000);
        hatiko.interrupt();
        
        
    }
}
