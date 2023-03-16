import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {
    @Test
    public void test_squareRoot() {
        double a = 169.0;
        double expectedResult = 13.0;
        double result = Main.squareRoot(a);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

//    @Test
//    public void test_factorial() {
//        int a = 7;
//        int expectedResult = 5040;
//        int result = Main.factorial(a);
//        Assert.assertEquals(expectedResult, result);
//    }
//
//    @Test
//    public void test_naturalLog() {
//        double a = 2.718;
//        double expectedResult = 1.0;
//        double result = Main.naturalLog(a);
//        Assert.assertEquals(expectedResult, result, 0.2f);
//    }
//
//    @Test
//    public void test_power() {
//        double a = 3.0;
//        double b = 4.0;
//        double expectedResult = 81.0;
//        double result = Main.power(a,b);
//        Assert.assertEquals(expectedResult, result, 0.0f);
//    }

}
