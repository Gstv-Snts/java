package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.DelDel;

public class DelDelTest {
    @Test
    public void delDelTest() {
        var delDel = new DelDel();
        assertEquals("abc", delDel.delDel("adelbc"));
        assertEquals("aHello", delDel.delDel("adelHello"));
        assertEquals("adedbc", delDel.delDel("adedbc"));
    }
}
