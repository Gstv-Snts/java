package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.NoTriples;

public class NoTriplesTest {
    @Test
    public void noTriplesTest() {
        var noTriples = new NoTriples();
        assertEquals(true, noTriples.noTriples(new int[] { 1, 1, 2, 2, 1 }));
        assertEquals(false, noTriples.noTriples(new int[] { 1, 1, 2, 2, 2, 1 }));
        assertEquals(false, noTriples.noTriples(new int[] { 1, 1, 1, 2, 2, 2, 1 }));
    }
}
