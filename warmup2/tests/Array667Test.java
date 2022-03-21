package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.Array667;

public class Array667Test {
    @Test
    public void array667Test() {
        var array667 = new Array667();
        assertEquals(1, array667.array667(new int[] { 6, 6, 2 }));
        assertEquals(1, array667.array667(new int[] { 6, 6, 2, 6 }));
        assertEquals(1, array667.array667(new int[] { 6, 7, 2, 6 }));
    }
}
