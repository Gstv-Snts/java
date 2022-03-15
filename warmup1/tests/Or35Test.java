package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.Or35;

public class Or35Test {
    @Test
    public void or35Test() {
        var or35 = new Or35();
        assertEquals(true, or35.or35(3));
        assertEquals(true, or35.or35(10));
        assertEquals(false, or35.or35(8));
    }
}
