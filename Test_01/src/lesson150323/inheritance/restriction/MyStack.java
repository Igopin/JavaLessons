package lesson150323.inheritance.restriction;

import java.util.ArrayDeque;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyStack extends ArrayDeque {

	@Override
	public void addFirst(Object e) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Object removeFirst() {
		throw new UnsupportedOperationException();
	}
	
}
