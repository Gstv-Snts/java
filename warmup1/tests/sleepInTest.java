package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.sleepIn;

public class sleepInTest {

    @Test
    public void sleepIn() {
        var sleepIn = new sleepIn();
        assertEquals(true, sleepIn.sleepIn(true, true));
        assertEquals(true, sleepIn.sleepIn(false, true));
        assertEquals(true, sleepIn.sleepIn(false, false));
        assertEquals(false, sleepIn.sleepIn(true, false));
    }
}