package lesson150430.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ATestTest {

    static {
        System.out.println("static init");
    }
    
    {
        System.out.println("init");
    }
    
    @BeforeClass
    public static void setupClass() {
        System.err.println("before class");
    }
    
    @Before
    public void setup() {
        System.out.println("setup");
    }

    @Test
    public void test1() {
        System.out.println("test 1");

    }

    @Test
    public void test2() {
        System.out.println("test 2");

    }

    @After
    public void teardown() {
        System.out.println("teardown!");
    }

}
