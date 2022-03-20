package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.StringX;

public class StringXTest {
    @Test
    public void stringXTest() {
        var stringX = new StringX();
        assertEquals("xHix", stringX.stringX("xxHxix"));
        assertEquals("xabcdx", stringX.stringX("xabxxxcdx"));
        assertEquals("xabcdx", stringX.stringX("xabxxxcdx"));
    }
}
