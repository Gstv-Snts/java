package warmup1.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup1.MissingChar;

public class MissingCharTest {
    @Test
    public void missingCharTest() {
        var missingChar = new MissingChar();
        assertEquals("ktten", missingChar.missingChar("kitten", 1));
        assertEquals("itten", missingChar.missingChar("kitten", 0));
        assertEquals("kittn", missingChar.missingChar("kitten", 4));
    }
}
