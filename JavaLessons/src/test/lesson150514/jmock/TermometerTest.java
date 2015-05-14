package lesson150514.jmock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TermometerTest {

    private Termometer term;

    @Before
    public void setup() {
        term = new Termometer();

    }
    
    @Test
    public void createTermometer() {
        assertEquals(0, term.currentTemperaure);
    }
    
    public void inc() throws Exception {
        term.inc();
        assertEquals(1, term.currentTemperaure);
    }

    public void dec() throws Exception {
        term.inc();
        term.dec();
        assertEquals(1, term.currentTemperaure);
    }
}
