package lesson150430.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ATest { // TDD Test Driven Development

    {
        System.out.println("Init ATest");
    }

    A a;

    @Before
    public void setup() {
        System.out.println("Setup!");
        a = new A();
    }
    
    @Test
    public void createObject() {
        assertEquals(0, a.state);
    }

    @Test
    public void changeState() {
        a.change();
        assertEquals(1, a.state);
    }
    
    @Test
    public void changeCycling() throws Exception {
        a = new A();
        a.change();
        a.change();
        a.change();
        assertEquals(0, a.state);
    }
    
    @Test
    public void decrase() throws Exception {
        a = new A();
        a.dec();
        assertEquals(-1, a.state);
    }
}
