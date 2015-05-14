package lesson150512.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTest {


    @Test
    public void edgesCreatedInConstructor() {
        Graph g = new Graph(4);
        assertNotNull(g);
    }

    
    @Test
    public void verticesStoredInconstructor() {
        Graph g = new Graph(4);
        assertNotNull(g.edges);
        assertEquals(4, g.edges.length);

        Graph g2 = new Graph(10);
        assertEquals(10, g2.edges.length);
    }
    
    @Test
    public void zeroConstructorParametr() throws Exception {
        try {
            new Graph(0);
            fail("Graph vertices must be > 0");
        } catch (IllegalArgumentException iae) {
            
        }
    }

    @Test
    public void negativeConstructorParametr() throws Exception {
        try {
            new Graph(-1);
            fail("Graph vertices must be > 0");
        } catch (IllegalArgumentException iae) {
            
        }
    }


}
