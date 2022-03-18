package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.FrontTimes;

public class FrontTimesTest {
    @Test
    public void frontTimesTest() {
        var frontTimes = new FrontTimes();
        assertEquals("ChoCho", frontTimes.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", frontTimes.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", frontTimes.frontTimes("Abc", 3));
    }
}
