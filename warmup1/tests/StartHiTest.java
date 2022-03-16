package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.StartHi;

public class StartHiTest {
    @Test
    public void startHiTest() {
        var startHi = new StartHi();
        assertEquals(true, startHi.startHi("hi there"));
        assertEquals(true, startHi.startHi("hi"));
        assertEquals(false, startHi.startHi("hello hi"));
    }
}
