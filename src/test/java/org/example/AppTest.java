package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testForGrade()
    {
        int i = new Random().nextInt(2500);
        if (i > 2000) {
            Assert.assertEquals(1, new App().function(i));
        } else if (i > 1300 && i <= 2000) {
            Assert.assertEquals(2, new App().function(i));
        } else if (i > 800 && i <= 1300) {
            Assert.assertEquals(3, new App().function(i));
        } else if (i > 500 && i <= 800) {
            Assert.assertEquals(4, new App().function(i));
        } else if (i > 200 && i <= 500) {
            Assert.assertEquals(5, new App().function(i));
        } else if (i >= 50 && i <= 200) {
            Assert.assertEquals(6, new App().function(i));
        } else if (i < 50) {
            Assert.assertEquals(7, new App().function(i));
        }
    }
}
