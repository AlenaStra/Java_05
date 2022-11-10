import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    @Test
    public void testCountEvenValuesInArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int expectedResult = 4;
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountOddValuesInArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int expectedResult = 3;
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
