import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {
    @Test
    public void test_squareRoot() {
        double a = 484.0;
        double b = 1225.0;
//        double c = 169.0;
        double result1 = Main.squareRoot(a);
        double result2 = Main.squareRoot(b);
//        double result3 = Main.squareRoot(c);
        Assert.assertEquals(22, result1, 0.0f);
        Assert.assertEquals(35, result2, 0.0f);
//        Assert.assertEquals(13, result3, 0.0f);
    }

    @Test
    public void test_factorial() {
        int a = 6;
        int b = 7;
        int expectedResult = 720;
        int result1 = Main.factorial(a);
        int result2 = Main.factorial(b);
        Assert.assertEquals(720, result1);
        Assert.assertEquals(5040, result2);
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
        double a1 = 4.0;
        double b1 = 5.0;
        double a2 = 3.0;
        double b2 = 5.0;
        double expectedResult = 1024.0;
        double result1 = Main.power(a1,b1);
        double result2 = Main.power(a2,b2);
        Assert.assertEquals(1024, result1, 0.0f);
        Assert.assertEquals(243, result2, 0.0f);
    }

}
