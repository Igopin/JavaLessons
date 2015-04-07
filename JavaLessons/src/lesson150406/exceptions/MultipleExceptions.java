package lesson150406.exceptions;

public class MultipleExceptions {

    public static class Exception1 extends Exception {

        public Exception1(String string) {
            super(string);
        }

    }

    public static class Exception2 extends Exception1 {

        public Exception2(String string) {
            super(string);
        }

    }

    public static class Exception3 extends Exception2 {

        public Exception3(String string) {
            super(string);
        }

    }

    public static void main(String[] args) {
        System.out.println("start");

        // try {
        // a();
        // } catch (Exception1 | Exception2 | Exception3 e) { // multi-catch
        // e.printStackTrace();
        // }

        try {
            a();
            System.out.println("after a");
        } catch (Exception3 e) { // multi-catch
            System.out.println("exception 3 special block");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception2 e) {
            System.out.println(e.getLocalizedMessage());
        } catch (Exception1 e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    private static void a() throws Exception3, Exception2, Exception1 {
        b();
        System.out.println("after b");
        throw new Exception3("ex3");
    }

    private static void b() throws Exception2, Exception1 {
        c();
        System.out.println("after c");
        throw new Exception2("ex2");
    }

    private static void c() throws Exception1 {
        // throw new Exception1();
    }
}
