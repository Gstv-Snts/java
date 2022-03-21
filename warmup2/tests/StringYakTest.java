package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.StringYak;

public class StringYakTest {
    @Test
    public void stringYakTest() {
        var stringYak = new StringYak();
        assertEquals("pak", stringYak.stringYak("yakpak"));
        assertEquals("123ya", stringYak.stringYak("yak123ya"));
        assertEquals("pak", stringYak.stringYak("pakyak"));
    }
}
