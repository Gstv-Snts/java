package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.LastDigit;

public class LastDigitTest {
    @Test
    public void lastDigitTest() {
        var lastDigit = new LastDigit();
        assertEquals(true, lastDigit.lastDigit(7, 17));
        assertEquals(false, lastDigit.lastDigit(6, 17));
        assertEquals(true, lastDigit.lastDigit(3, 113));
    }
}
