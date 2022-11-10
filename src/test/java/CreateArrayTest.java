import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void testCreateIntArray_HappyPath() {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};
        int[] actualResult = new CreateArray().createIntArray(a,b,c,d,e);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCreateIntArrayAllZeroes_Negative() {

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int[] expectedResult = {0};
        int[] actualResult = new CreateArray().createIntArray(a,b,c,d,e);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCreateDoubleArray_HappyPath() {

        double a = 1.1;
        double b = 2.5;
        double c = 3.7;
        double d = 4.0;
        double e = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};
        double[] actualResult = new CreateArray().createDoubleArray(a,b,c,d,e);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCreateDoubleArrayAllZeroes_Negative() {

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double d = 0.0;
        double e = 0.0;
        double[] expectedResult = {0.0};
        double[] actualResult = new CreateArray().createDoubleArray(a,b,c,d,e);
        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test
    public void testCreateStringArray_HappyPath() {

        String a = "It";
        String b = "was";
        String c = "an";
        String d = "apple";
        String e = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};
        String[] actualResult = new CreateArray().createStringArray(a,b,c,d,e);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCreateStringArraySomeNull_Negative() {

        String a = "It";
        String b = "was";
        String c = "an";
        String d = null;
        String e = "pie";
        String[] expectedResult = null;
        String[] actualResult = new CreateArray().createStringArray(a,b,c,d,e);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCreateArrayFromText_HappyPath() {
        String sentence = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};
        String[] actualResult = new CreateArray().createArrayFromText(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCreateArrayFromTextNull_Negative() {
        String sentence = null;
        String[] expectedResult = null;
        String[] actualResult = new CreateArray().createArrayFromText(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }
}
