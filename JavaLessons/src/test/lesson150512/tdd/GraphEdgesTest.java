package lesson150512.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GraphEdgesTest {

    private Graph g;
    
    @Before
    public void setup() {
        g = new Graph(4);
    }

    @Test
    public void addEdgeCorrectVertices() throws Exception {
        try {
            g.addEdge(4,5);
            fail("wrong params, bitch");
        } catch (IllegalArgumentException iea) {
        }
    }
    
    @Test
    public void edgeCount() throws Exception {
        g.addEdge(0, 1);
        assertEquals(1, g.getEdges());
        g.addEdge(1, 3);
        assertEquals(2, g.getEdges());
    }
    
    @Test
    public void addEdge() throws Exception {
        assertFalse(g.connected(0, 1));
        g.addEdge(0, 1);
        assertTrue(g.connected(0,1));
        assertTrue(g.connected(1,0));
        g.addEdge(0, 2);
        assertTrue(g.connected(0,2));
        assertTrue(g.connected(2,0));
    }
}
