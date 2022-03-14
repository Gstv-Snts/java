package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.Diff21;

/**
 * Diff21Test
 */
public class Diff21Test {

    @Test
    public void diff21Test() {
        var diff21 = new Diff21();
        assertEquals(2, diff21.diff21(19));
        assertEquals(11, diff21.diff21(10));
        assertEquals(0, diff21.diff21(21));
    }
}