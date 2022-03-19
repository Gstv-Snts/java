package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.Last2;

public class Last2Test {
    @Test
    public void last2Test() {
        var last2 = new Last2();
        assertEquals(1, last2.last2("hixxhi"));
        assertEquals(1, last2.last2("xaxxaxaxx"));
        assertEquals(2, last2.last2("axxxaaxx"));
    }
}
