package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.Max1020;

public class Max1020Test {
    @Test
    public void max1020Test() {
        var max1020 = new Max1020();
        assertEquals(19, max1020.max1020(11, 19));
        assertEquals(19, max1020.max1020(19, 11));
        assertEquals(11, max1020.max1020(11, 9));
    }
}
