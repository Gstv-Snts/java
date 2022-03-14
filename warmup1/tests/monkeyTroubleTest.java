package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.monkeyTrouble;

public class monkeyTroubleTest {
    @Test
    public void monkeyTroubleTest() {
        var monkeyTrouble = new monkeyTrouble();
        assertEquals(true, monkeyTrouble.monkeyTrouble(true, false));
        assertEquals(false, monkeyTrouble.monkeyTrouble(true, true));
        assertEquals(false, monkeyTrouble.monkeyTrouble(false, false));
    }
}
