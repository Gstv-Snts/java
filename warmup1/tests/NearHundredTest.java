package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.NearHundred;

public class NearHundredTest {
    @Test
    public void nearHundredTest() {
        var nearHundred = new NearHundred();
        assertEquals(true, nearHundred.nearHundred(93));
        assertEquals(true, nearHundred.nearHundred(90));
        assertEquals(false, nearHundred.nearHundred(89));
    }
}
