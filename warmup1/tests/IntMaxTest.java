package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.IntMax;

public class IntMaxTest {
    @Test
    public void intMaxTest() {
        var intMax = new IntMax();
        assertEquals(3, intMax.intMax(1, 2, 3));
        assertEquals(3, intMax.intMax(1, 3, 2));
        assertEquals(3, intMax.intMax(3, 2, 1));
    }
}
