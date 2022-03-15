package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.FrontBack;

public class FrontBackTest {
    @Test
    public void frontBackTest() {
        var frontBack = new FrontBack();
        assertEquals("eodc", frontBack.frontBack("code"));
        assertEquals("a", frontBack.frontBack("a"));
        assertEquals("ba", frontBack.frontBack("ab"));
    }
}
