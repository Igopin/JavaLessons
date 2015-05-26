package lesson150526.concurrency;

import utils.Utils;

public class InterruptedExample {

    static class Task implements Runnable {

        volatile boolean stopped;

        @Override
        public void run() {
            long count = 0;
            while (!Thread.interrupted()) {
                count++;
            }
            System.out.println("count = " + count);
        }
        
        public void stop() {
            stopped = true;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("start");
        
        Task task = new Task();
        Thread thread =  new Thread(task);

        thread.start();
        Utils.pause(3000);
        
        //task.stop();
        thread.interrupt();
        
        
        System.out.println("finish");
    }
}
