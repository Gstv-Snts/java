package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.StartOz;

public class StartOzTest {
    @Test
    public void startOzTest() {
        var startOz = new StartOz();
        assertEquals("oz", startOz.startOz("ozymandias"));
        assertEquals("z", startOz.startOz("bzoo"));
        assertEquals("o", startOz.startOz("oxx"));
    }
}
