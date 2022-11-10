import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testMinMaxAve_HappyPath() {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
    int element1 = 2;
    int element2 = 6;

    int[] expectedResult = {3,7,5};
    int[] actualResult = MinMaxAve.minMaxAve(array,element1, element2);
        Assert.assertEquals(actualResult,expectedResult);


    }
}
