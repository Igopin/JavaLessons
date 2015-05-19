package lesson150519.concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.Utils;

public class ThreadCreationByExecutors {

    static class Task implements Runnable {
        @Override
        public void run() {
            Utils.pause(1000);
            System.out.println(Thread.currentThread().getName() + ": alah akbar!");
        }
    }
    public static void main(String[] args) {
        //ExecutorService ex = Executors.newSingleThreadExecutor();
        ExecutorService ex = Executors.newFixedThreadPool(2);
        ex.execute(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("hello!");
            }
        });
        
        Task command = new Task();
        ex.execute(command);
        ex.execute(command);
        ex.execute(command);
        ex.execute(command);

        ex.shutdown();
        System.out.println(Thread.currentThread().getName() + ": Finish!");
    }
}
