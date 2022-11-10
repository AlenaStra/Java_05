import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerMTest {

    @Test
    public void testIntegerMGoodNumber_HappyPath() {
        int m = 63;
        String expectedResult = "Good Number";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIntegerMBadNumber_HappyPath() {
        int m = 18;
        String expectedResult = "Bad Number";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIntegerMPoorNumber_HappyPath() {
        int m = 22;
        String expectedResult = "Poor Number";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIntegerMOther_HappyPath() {
        int m = 4;
        String expectedResult = "-1";
        String actualResult = new IntegerM().integerM(m);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
