package warmup2.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import warmup2.CountXX;

public class CountXXTest {
    @Test
    public void countXXTest() {
        var countXX = new CountXX();
        assertEquals(1, countXX.countXX("abcxx"));
        assertEquals(2, countXX.countXX("xxx"));
        assertEquals(3, countXX.countXX("xxxx"));
    }
}
