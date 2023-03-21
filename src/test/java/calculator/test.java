import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {
    @Test
    public void test_squareRoot() {
        double a = 484.0;
        double expectedResult = 22.0;
        double result = Main.squareRoot(a);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_factorial() {
        int a = 6;
        int expectedResult = 720;
        int result = Main.factorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    //
    @Test
    public void test_naturalLog() {
        double a = 2.718;
        double expectedResult = 1.0;
        double result = Main.naturalLog(a);
        Assert.assertEquals(expectedResult, result, 0.2f);
    }

    @Test
    public void test_power() {
        double a = 4.0;
        double b = 5.0;
        double expectedResult = 1024.0;
        double result = Main.power(a,b);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

}
