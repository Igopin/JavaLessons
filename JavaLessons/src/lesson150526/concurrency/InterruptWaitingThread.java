package lesson150526.concurrency;

import java.util.concurrent.TimeUnit;

import utils.Utils;

public class InterruptWaitingThread {

    static class Task implements Runnable {

        @Override
        public void run() {
            synchronized (this) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("catched interruption!");
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("start");
        Thread t = new Thread(new Task());
        t.start();
        
        Utils.pause(3000);
        t.interrupt();
        
        System.out.println("finish");
    }
}
