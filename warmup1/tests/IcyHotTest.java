package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.IcyHot;

public class IcyHotTest {
    @Test
    public void icyHotTest() {
        var icyHot = new IcyHot();
        assertEquals(true, icyHot.icyHot(120, -1));
        assertEquals(true, icyHot.icyHot(-1, 100));
        assertEquals(false, icyHot.icyHot(2, 120));
    }

}
