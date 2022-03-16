package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.BackAround;

public class BackAroundTest {
    @Test
    public void backAroundTest() {
        var backAround = new BackAround();
        assertEquals("tcatt", backAround.backAround("cat"));
        assertEquals("oHelloo", backAround.backAround("Hello"));
        assertEquals("aaa", backAround.backAround("a"));
    }
}
