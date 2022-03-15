package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.Front3;

public class Front3Test {
    @Test
    public void Front3Test() {
        var front3 = new Front3();
        assertEquals("JavJavJav", front3.front3("Java"));
        assertEquals("ChoChoCho", front3.front3("Chocolate"));
        assertEquals("acbacbacb", front3.front3("acb"));
    }
}
