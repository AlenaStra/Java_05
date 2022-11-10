import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void testIsPositiveNumberPos_HappyPath() {
        int a = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIsPositiveNumberNeg_HappyPath() {
        int a = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIsPositiveNumberZero_HappyPath() {
        int a = 0;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(a);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
