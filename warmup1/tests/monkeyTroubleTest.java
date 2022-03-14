package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.SonkeyTrouble;

public class MonkeyTroubleTest {
    @Test
    public void monkeyTroubleTest() {
        var monkeyTrouble = new SonkeyTrouble();
        assertEquals(false, monkeyTrouble.monkeyTrouble(true, false));
        assertEquals(true, monkeyTrouble.monkeyTrouble(true, true));
        assertEquals(true, monkeyTrouble.monkeyTrouble(false, false));
    }
}
