package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.AltPairs;

public class AltPairsTest {
    @Test
    public void altPairsTest() {
        var altPairs = new AltPairs();
        assertEquals("kien", altPairs.altPairs("kitten"));
        assertEquals("Chole", altPairs.altPairs("Chocolate"));
        assertEquals("Congrr", altPairs.altPairs("CodingHorror"));
    }
}
