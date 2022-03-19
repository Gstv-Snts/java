package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.ArrayFront9;

public class ArrayFront9Test {
    @Test
    public void arrayFront9Test() {
        var arrayFront9 = new ArrayFront9();
        assertEquals(true, arrayFront9.arrayFront9(new int[] { 1, 2, 9, 3, 4 }));
        assertEquals(false, arrayFront9.arrayFront9(new int[] { 1, 2, 3, 4, 9 }));
        assertEquals(false, arrayFront9.arrayFront9(new int[] { 1, 2, 3, 4, 5 }));
    }
}
