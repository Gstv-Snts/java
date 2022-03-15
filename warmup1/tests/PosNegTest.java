package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.PosNeg;

public class PosNegTest {
    @Test
    public void posNegTest() {
        var posNeg = new PosNeg();
        assertEquals(true, posNeg.posNeg(1, -1, false));
        assertEquals(true, posNeg.posNeg(-1, 1, false));
        assertEquals(true, posNeg.posNeg(-4, -5, true));
    }
}
