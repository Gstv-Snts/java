package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.In1020;

public class In1020Test {
    @Test
    public void in1020Test() {
        var in1020 = new In1020();
        assertEquals(true, in1020.in1020(12, 99));
        assertEquals(true, in1020.in1020(21, 12));
        assertEquals(false, in1020.in1020(8, 99));
    }
}
