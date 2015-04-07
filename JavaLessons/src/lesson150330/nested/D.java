package lesson150330.nested;

public class D { // outer

    static class S {
        D d;

        S(final D d) {
            this.d = d;
        }

        void print() {
            System.out.println(d.state);
        }
    }

    public int state;
    S s;

    public D() {
        s = new S(this);
    }
}
