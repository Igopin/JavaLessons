package lesson150330.nested;

import lesson150330.nested.B.C;

public class Use {

	public static void main(String[] args) {
		B b = new B();
		B.C c = new B.C();
		B.C c2 = new B.C();
		
		D d = new D();
		d.s.print();
		
		E e = new E();
		e.i.print();
		
		E.I i = e.new I();
    }
}
