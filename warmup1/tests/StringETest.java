package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.StringE;

public class StringETest {
    @Test
    public void stringETest() {
        var stringE = new StringE();
        assertEquals(true, stringE.stringE("Hello"));
        assertEquals(true, stringE.stringE("Heelle"));
        assertEquals(false, stringE.stringE("Heelele"));
    }
}
