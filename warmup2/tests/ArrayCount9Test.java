package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.ArrayCount9;

public class ArrayCount9Test {
    @Test
    public void arrayCount9Test() {
        var arrayCount9 = new ArrayCount9();
        assertEquals(1, arrayCount9.arrayCount9(new int[] { 1, 2, 9 }));
        assertEquals(2, arrayCount9.arrayCount9(new int[] { 1, 9, 9 }));
        assertEquals(3, arrayCount9.arrayCount9(new int[] { 1, 9, 9, 3, 9 }));
    }
}
