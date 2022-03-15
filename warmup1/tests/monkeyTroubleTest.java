package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.MonkeyTrouble;

public class MonkeyTroubleTest {
    @Test
    public void monkeyTroubleTest() {
        var monkeyTrouble = new MonkeyTrouble();
        assertEquals(false, monkeyTrouble.monkeyTrouble(true, false));
        assertEquals(true, monkeyTrouble.monkeyTrouble(true, true));
        assertEquals(true, monkeyTrouble.monkeyTrouble(false, false));
    }
}
