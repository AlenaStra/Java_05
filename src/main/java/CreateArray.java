public class CreateArray {

    /* Part 1.1 Arrays
    Task 1.    В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(), который
    принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
    Например, createIntArray(1, 2, 3, 4, 5) -> {1, 2, 3, 4, 5}
     */

    public int[] createIntArray(int a, int b, int c, int d, int e) {
        if (a != 0 && b != 0 && c != 0 && d != 0 && e != 0) {
            int[] array = new int[]{a, b, c, d, e};
            return array;
        }
        return new int[]{0};
    }

    /* Task 2. Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double, и возвращает
    массив из этих же чисел
    Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */
    public double[] createDoubleArray(double a, double b, double c, double d, double e) {
        if (a != 0 && b != 0 && c != 0 && d != 0 && e != 0) {
            double[] array = new double[]{a, b, c, d, e};
            return array;
        }
        return new double[]{0.0};
    }

    /* Task 3. Написать метод createStringArray(), который принимает на вход 5 слов, и возвращает массив из этих слов
        Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public String[] createStringArray(String a, String b, String c, String d, String e) {
        if (a != null && b != null && c != null && d != null && e != null) {
            String[] array = new String[]{a, b, c, d, e};

            return array;

        } return null;
    }

    /* Task 4. //4я задача только для тех, кто хочет разобраться с методом класса String split()
        Написать метод createArrayFromText(), который принимает на вход предложение из нескольких слов и возвращает
         массив из этих слов.
        Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public String[] createArrayFromText(String sentence) {
        if (sentence != null) {
            String[] array = sentence.split(" ");

            return array;
        }

        return null;
    }



}
