package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.EndUp;

public class EndUpTest {
    @Test
    public void endUpTest() {
        var endUp = new EndUp();
        assertEquals("HeLLO", endUp.endUp("Hello"));
        assertEquals("hi thERE", endUp.endUp("hi there"));
        assertEquals("HI", endUp.endUp("hi"));
    }
}
