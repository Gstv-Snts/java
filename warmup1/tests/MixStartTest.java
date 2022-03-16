package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.MixStart;

public class MixStartTest {
    @Test
    public void mixStartTest() {
        var mixStart = new MixStart();
        assertEquals(true, mixStart.mixStart("mix snacks"));
        assertEquals(true, mixStart.mixStart("pix snacks"));
        assertEquals(false, mixStart.mixStart("piz snacks"));
    }
}
