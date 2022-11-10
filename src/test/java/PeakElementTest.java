import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {
//    {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPeakElement_HappyPath() {

    int[] array = {3, 2, 7, 5, 1, 9, 23, 1};
    int[] expectedResult = {3, 7, 23};
    int[] actualResult = new PeakElement().peakElement(array);
    Assert.assertEquals(actualResult, expectedResult);

    }

}
