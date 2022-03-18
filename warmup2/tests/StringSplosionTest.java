package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.StringSplosion;

public class StringSplosionTest {
    @Test
    public void stringSplosionTest() {
        var stringSplosion = new StringSplosion();
        assertEquals("CCoCodCode", stringSplosion.stringSplosion("Code"));
        assertEquals("aababc", stringSplosion.stringSplosion("abc"));
        assertEquals("aab", stringSplosion.stringSplosion("ab"));
    }
}
