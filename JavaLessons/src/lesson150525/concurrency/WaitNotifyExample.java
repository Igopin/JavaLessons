package lesson150525.concurrency;

import utils.Utils;

public class WaitNotifyExample {

    static class Sprinter implements Runnable {
        @Override
        public void run() {
            System.out.println("created " + this);
            synchronized (this) {
                try {
                    System.out.println("before wait " + this);
                    wait();  // this.wait();
                    System.out.println("after wait " + this);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("started " + this);
        }
    }
    
    public static void main(String[] args) {
        Sprinter sprinter = new Sprinter();
        
        new Thread(sprinter).start();
        
        Utils.pause(3000);
        synchronized (sprinter) {
            sprinter.notifyAll();
            Utils.pause(5000);
        }
        Utils.pause(5000);
    }
}
