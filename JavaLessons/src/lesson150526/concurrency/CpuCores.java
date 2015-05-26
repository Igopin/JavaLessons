package lesson150526.concurrency;

public class CpuCores {


    public static void main(String[] args) {
        int availableProcessor = Runtime.getRuntime().availableProcessors();
        System.out.println("cpu cores: " + availableProcessor);
    }
}
