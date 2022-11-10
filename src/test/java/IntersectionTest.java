import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {

//    Test Data:
//    {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
//    {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
//    {1, 2, 4, 5, 89}, {8, 9, 45} → {}

    @Test
    public void testIntersectionPosNumbers_HappyPath() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};
        int[] actualResult = new Intersection().intersection(array1, array2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIntersectionNegNumbers_HappyPath() {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};
        int[] actualResult = new Intersection().intersection(array1, array2);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test
    public void testIntersectionNoCommonNumbers_Negative() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};
        int[] actualResult = new Intersection().intersection(array1, array2);
        Assert.assertEquals(actualResult,expectedResult);

    }




}
