package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.Front22;

public class Front22Test {
    @Test
    public void front22Test() {
        var front22 = new Front22();
        assertEquals("kikittenki", front22.front22("kitten"));
        assertEquals("HaHaHa", front22.front22("Ha"));
        assertEquals("ababcab", front22.front22("abc"));
    }
}
