package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.StringBits;

public class StringBitsTest {
    @Test
    public void stringBitsTest() {
        var stringBits = new StringBits();
        assertEquals("Hlo", stringBits.stringBits("Hello"));
        assertEquals("H", stringBits.stringBits("Hi"));
        assertEquals("Hello", stringBits.stringBits("Heeololeo"));
    }
}
