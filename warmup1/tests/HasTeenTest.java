package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.HasTeen;

public class HasTeenTest {
    @Test
    public void hasTeenTest() {
        var hasTeen = new HasTeen();
        assertEquals(true, hasTeen.hasTeen(13, 20, 10));
        assertEquals(true, hasTeen.hasTeen(20, 19, 10));
        assertEquals(true, hasTeen.hasTeen(20, 10, 13));
    }
}
