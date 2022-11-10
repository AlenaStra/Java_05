import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test
    public void testRemoveSpacesSpacesPresent_HappyPath() {
        String a = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveSpacesNoSpaces_HappyPath() {
        String a = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveSpacesEmptyString_Negative() {
        String a = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAsNoAs_HappyPath() {
        String a = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAsSomeAs_HappyPath() {
        String a = "panda   ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(a);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllAsLotsOfAs_HappyPath() {
        String a = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(a);
        Assert.assertEquals(actualResult,expectedResult);
    }
//
//    “3504209706040000 “ →  “35429764“
//            “0000000111“ → “111”
    @Test
    public void testRemoveAllZeroesMixedZeroes_HappyPath() {
        String numbers = "3504209706040000";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeroes(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllZeroesGroupedZeroes_HappyPath() {
        String numbers = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeroes(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRemoveAllZeroesNoZeroes_Negative() {
        String numbers = "155647976463247";
        String expectedResult = "This is a valid string.";
        String actualResult = new StringMethods().removeAllZeroes(numbers);
        Assert.assertEquals(actualResult,expectedResult);
    }

//    “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
//            “p a     n   d a   “ → “panda”
    @Test
    public void testRemoveAllSpaces_HappyPath() {
        String a = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(a);
        Assert.assertEquals(actualResult,expectedResult);
}

    @Test
    public void testRemoveAllSpaces2_HappyPath() {
        String a = "p a     n   d a   ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(a);
        Assert.assertEquals(actualResult,expectedResult);
    }
//    “Abracadabra” → “5, 6”
//            “Homenum Revelio” → “0, 15”
//            “3 tarAmasAlatA” → “6, 8”
    @Test
    public void testCountAs_HappyPath() {
        String phrase = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(phrase);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountAs2_HappyPath() {
        String phrase = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(phrase);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountAsNoAs_Negative() {
        String phrase = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(phrase);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountAsEmptyString_Negative() {
        String phrase = "";
        String expectedResult = "enter a valid string";
        String actualResult = new StringMethods().countAs(phrase);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountJava_Positive() {
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support\n" +
                "        (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January\n" +
                "        2019 for commercial use, although it will otherwise still support Java 8 with public updates for personal use\n" +
                "        indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving\n" +
                "        security and other upgrades.";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCountJava_Negative() {
        String text = "99 little bugs in a code.\n" +
                "        99 little bugs in a code.\n" +
                "        Take one down, and patch it around.\n" +
                "        235 critical bugs in the code.";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(text);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testInsertQuotes() {
        String word = "Abracadabra";
        String expectedResult = "“Abracadabra”";
        String actualResult = new StringMethods().insertQuotes(word);
        Assert.assertEquals(actualResult,expectedResult);
    }
//    “ташкент” → “Ташкент”
//            “ЧикаГО” → “Чикаго”
    @Test
    public void testCorrectCityName_HappyPath() {
        String city = "ташкент";
        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().correctCityName(city);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCorrectCityName_HappyPath2() {
        String city = "ЧикаГО";
        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().correctCityName(city);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testPartOfString_HappyPath() {
        String text = "Abracadabra";
        String letter = "b";
        String expectedResult = "bracadab";
        String actualResult = new StringMethods().partOfString(text, letter);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testPartOfString2_HappyPath() {
        String text = "Whippersnapper";
        String letter = "e";
        String expectedResult = "ersnappe";
        String actualResult = new StringMethods().partOfString(text, letter);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testPartOfStringNoLetterFound_Negative() {
        String text = "Whippersnapper";
        String letter = "d";
        String expectedResult = "no letter found";
        String actualResult = new StringMethods().partOfString(text, letter);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSameStartAndEndYes_HappyPath() {
        String word = "Abracadabra";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().sameStartAndEnd(word);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSameStartAndEndNo_HappyPath() {
        String word = "Whippersnapper";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().sameStartAndEnd(word);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testTwoWordsIntoOne_HappyPath() {
        String s = "Red Rover";
        String expectedResult = "Rover";
        String actualResult = new StringMethods().twoWordsIntoOne(s);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testDeleteBetweenIndices_HappyPath() {
        String s = "Red rover";
        int start = 1;
        int end = 4;
        String expectedResult = "Rover";
        String actualResult = new StringMethods().deleteBetweenIndices(s, start, end);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStringToArray_HappyPath() {
        String sentence = "QA for Everyone";
        String[] expectedResult = {"QA", "for", "Everyone"};
        String[] actualResult = new StringMethods().stringToArray(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStringToArray2_HappyPath() {
        String sentence = "Александр Сергеевич Пушкин";
        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};
        String[] actualResult = new StringMethods().stringToArray(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStringToArray_Negative() {
        String sentence = "";
        String[] expectedResult = {"enter valid data"};
        String[] actualResult = new StringMethods().stringToArray(sentence);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test  //Array- does not return 2D array-only split names
    public void testNameBreakdown_HappyPath() {
        String name = "Александр Сергеевич Пушкин";
        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};
        String[] actualResult = new StringMethods().nameBreakdown(name);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test    //String
    public void testNameBreakdown1_HappyPath() {
        String name = "Александр Сергеевич Пушкин";
        String expectedResult = "Имя:Александр\n" +
                "Отчество: Сергеевич\n" +
                "Фамилия: Пушкин";
        String actualResult = new StringMethods().nameBreakdown1(name);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRepeatString_HappyPath() {
        String word = "one";
        int n = 5;
        String expectedResult = "oneoneoneoneone";
        String actualResult = new StringMethods().repeatString(word, n);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testStringIndexIntoInt_HappyPath(){
        String text = "I liked that book.";
        int index = 5;
        int expectedResult = 101;
        int actualResult = new StringMethods().stringIndexIntoInt(text, index);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testCompareStrings_HappyPath() {
        String word1 = "one";
        String word2 = "One";
        String word3 = "ONE";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().compareStrings(word1, word2, word3);
        Assert.assertEquals(actualResult,expectedResult);
    }








}
