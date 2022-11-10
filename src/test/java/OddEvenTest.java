import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testOdd_HappyPath() {
        int a = -345;
        String expectedResult = "Odd";
        String actualResult = new OddEven().oddEven(-345);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testEven_HappyPath() {
        int a = 222222;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(222222);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testZero_HappyPath() {
        int a = 0;
        String expectedResult = "Even";
        String actualResult = new OddEven().oddEven(0);
        Assert.assertEquals(actualResult,expectedResult);
    }


}
