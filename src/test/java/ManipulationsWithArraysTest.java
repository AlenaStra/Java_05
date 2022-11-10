import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void testMultiplyArrayByNumber_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};
        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testMultiplyArrayByNumberZero_Negative() {
        int[] array = {1, 2, 3, 4, 5};
        int number = 0;
        int[] expectedResult = {0};
        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, number);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test   //Test passes even if expectedResult is changed to int values!!!!!!!!!!!!!!!!!!!!!!!!
    public void testToDoubleArray_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testToIntArray_HappyPath() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testToIntArrayEmpty_Negative() {
        double[] array = {};
        int[] expectedResult = {};
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testToStringArrayFromInt_HappyPath() {
        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};
        String[] actualResult =new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testToStringArrayEmptyInt_Negative() {
        int[] array = {};
        String[] expectedResult = {};
        String[] actualResult =new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testToStringArrayFromDouble_HappyPath() {
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};
        String[] actualResult =new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testToStringArrayEmptyDouble_Negative() {
        double[] array = {};
        String[] expectedResult = {};
        String[] actualResult =new ManipulationsWithArrays().toStringArray(array);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testAreValuesGreaterThanNumber_HappyPath() {
        int[] array = {5,6,1,36,20};
        int number = 1;
        boolean expectedResult = false;
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array,number);
        Assert.assertEquals(actualResult,expectedResult);
    }



}
