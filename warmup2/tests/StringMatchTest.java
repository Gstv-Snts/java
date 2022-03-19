package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.StringMatch;

public class StringMatchTest {
    @Test
    public void stringMatchTest() {
        var stringMatch = new StringMatch();
        assertEquals(3, stringMatch.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, stringMatch.stringMatch("abc", "abc"));
        assertEquals(0, stringMatch.stringMatch("abc", "axc"));
    }
}
