package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.Close10;

public class Close10Test {
    @Test
    public void close10Test() {
        var close10 = new Close10();
        assertEquals(8, close10.close10(8, 13));
        assertEquals(8, close10.close10(13, 8));
        assertEquals(0, close10.close10(13, 7));
    }
}
