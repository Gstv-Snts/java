package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.Array123;

public class Array123Test {
    @Test
    public void array123Test() {
        var array123 = new Array123();
        assertEquals(true, array123.array123(new int[] { 1, 1, 2, 3, 1 }));
        assertEquals(false, array123.array123(new int[] { 1, 1, 2, 4, 1 }));
        assertEquals(true, array123.array123(new int[] { 1, 1, 2, 1, 2, 3 }));
    }
}
