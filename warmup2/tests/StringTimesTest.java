package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.StringTimes;

public class StringTimesTest {
    @Test
    public void stringTimesTest() {
        var stringTimes = new StringTimes();
        assertEquals("HiHi", stringTimes.stringTimes("Hi", 2));
        assertEquals("HiHiHi", stringTimes.stringTimes("Hi", 3));
        assertEquals("Hi", stringTimes.stringTimes("Hi", 1));
    }
}
