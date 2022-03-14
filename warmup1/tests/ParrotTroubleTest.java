package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.ParrotTrouble;

public class ParrotTroubleTest {
    @Test
    public void parrotTroubleTest() {
        var parrotTrouble = new ParrotTrouble();
        assertEquals(true, parrotTrouble.parrotTrouble(true, 6));
        assertEquals(false, parrotTrouble.parrotTrouble(true, 7));
        assertEquals(false, parrotTrouble.parrotTrouble(false, 6));
    }
}
