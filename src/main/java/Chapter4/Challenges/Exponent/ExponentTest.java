package Chapter4.Challenges.Exponent;

import org.junit.Assert;
import org.junit.Test;

public class ExponentTest {
    Exponent e = new Exponent();

    /**
     * 2^2 should return 4.
     */
    @Test
    public void exponentTest1(){
        double inputBase = 2;
        int expBase = 2;
        double expected = 4;
        double actual = e.getExp(inputBase, expBase);
        Assert.assertEquals(expected, actual, .01);
    }

    /**
     * 3^2 should return 9.
     */
    @Test
    public void exponentTest2(){
        double inputBase = 3;
        int expBase = 2;
        double expected = 9;
        double actual = e.getExp(inputBase, expBase);
        Assert.assertEquals(expected, actual, .01);
    }

    /**
     * 3^3 should return 27.
     */
    @Test
    public void exponentTest3(){
        double inputBase = 3;
        int expBase = 3;
        double expected = 27;
        double actual = e.getExp(inputBase, expBase);
        Assert.assertEquals(expected, actual, .01);
    }

    /**
     * 4^1 should return 4.
     */
    @Test
    public void exponentTest4(){
        double inputBase = 4;
        int expBase = 1;
        double expected = 4;
        double actual = e.getExp(inputBase, expBase);
        Assert.assertEquals(expected, actual, .01);
    }

    /**
     * 4^3 should return 64.
     */
    @Test
    public void exponentTest5(){
        double inputBase = 4;
        int expBase = 3;
        double expected = 64;
        double actual = e.getExp(inputBase, expBase);
        Assert.assertEquals(expected, actual, .01);
    }
}
