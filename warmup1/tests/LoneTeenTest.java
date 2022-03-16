package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.LoneTeen;

public class LoneTeenTest {
    @Test
    public void loneTeenTest() {
        var loneTeen = new LoneTeen();
        assertEquals(true, loneTeen.loneTeen(13, 99));
        assertEquals(true, loneTeen.loneTeen(21, 19));
        assertEquals(false, loneTeen.loneTeen(13, 13));
    }
}