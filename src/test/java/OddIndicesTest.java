import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesEvenLengthOfArray_HappyPath() {
        int[] array = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};
        int[] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddIndicesOddLengthOfArray_HappyPath() {
        int[] array = {-45, 590, 234, 985, 12};

        int[] expectedResult = {590, 985};
        int[] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testOddIndicesEmptyArray_Negative() {
        int[] array = {};

        int[] expectedResult = {0};
        int[] actualResult = new OddIndices().oddIndices(array);
        Assert.assertEquals(actualResult, expectedResult);
    }

}

