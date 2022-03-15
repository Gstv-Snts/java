package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.Makes10;

public class Makes10Test {
    @Test
    public void makes10Test() {
        var makes10 = new Makes10();
        assertEquals(true, makes10.makes10(9, 10));
        assertEquals(false, makes10.makes10(9, 9));
        assertEquals(true, makes10.makes10(1, 9));
    }
}
