package warmup1.sleepIn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class sleepInTest {

    @Test
    public void areWeSleeping() {
        var sleepIn = new sleepIn();
        assertEquals(true, sleepIn.areWeSleeping(true, true));
        assertEquals(true, sleepIn.areWeSleeping(false, true));
        assertEquals(true, sleepIn.areWeSleeping(false, false));
        assertEquals(false, sleepIn.areWeSleeping(true, false));

    }
}