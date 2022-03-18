package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.DoubleX;

public class DoubleXTest {
    @Test
    public void doubleXTest() {
        var doubleX = new DoubleX();
        assertEquals(true, doubleX.doubleX("axxbb"));
        assertEquals(false, doubleX.doubleX("axaxax"));
        assertEquals(true, doubleX.doubleX("xxxxx"));
    }
}
