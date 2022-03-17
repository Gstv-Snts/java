package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.In3050;

public class In3050Test {
    @Test
    public void in3050Test() {
        var in3050 = new In3050();
        assertEquals(true, in3050.in3050(30, 31));
        assertEquals(false, in3050.in3050(30, 41));
        assertEquals(true, in3050.in3050(40, 50));
    }
}
