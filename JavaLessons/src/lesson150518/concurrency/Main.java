package lesson150518.concurrency;

public class Main {

    //stream:
    //  - input / output
    //streams (Java 8)
    //thread нить, поток выполнения
    
    public static void main(String[] args) {

        int count = 0;
        while (true) {
            count++;
            if (count % 1000000000 == 0) {
                System.out.println(count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
