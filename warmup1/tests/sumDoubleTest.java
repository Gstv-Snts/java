package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.sumDouble;

public class sumDoubleTest {
    @Test
    public void sumDoubleTest() {
        var sumDouble = new sumDouble();
        assertEquals(3, sumDouble.sumDouble(1, 2));
        assertEquals(5, sumDouble.sumDouble(3, 2));
        assertEquals(8, sumDouble.sumDouble(2, 2));
    }
}
