package lesson150323.hiding;

public class B extends A {

    int state;

    @Override
    public void change() {
        state += 2;
    }

    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.getState());
        b.change(); // call local and changed local 'state', but getState get
                    // 'state' from A

        System.out.println(b.getState());
    }
}
