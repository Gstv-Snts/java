package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.NotString;

public class NotStringTest {
    @Test
    public void notStringTest() {
        var notString = new NotString();
        assertEquals("not candy", notString.notString("candy"));
        assertEquals("not x", notString.notString("x"));
        assertEquals("not bad", notString.notString("not bad"));
    }
}
