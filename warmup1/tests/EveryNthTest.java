package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.EveryNth;

public class EveryNthTest {
    @Test
    public void everyNthTest() {
        var everyNth = new EveryNth();
        assertEquals("Mrce", everyNth.everyNth("Miracle", 2));
        assertEquals("aceg", everyNth.everyNth("abcdefg", 2));
        assertEquals("adg", everyNth.everyNth("abcdefg", 3));
    }
}
