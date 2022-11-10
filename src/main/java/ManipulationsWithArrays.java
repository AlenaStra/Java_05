public class ManipulationsWithArrays {

    /* Part 1.1 Arrays
    Task 5. Написать метод multiplуArrayByNumber(), который принимает на вход массив целых чисел и число int number.
     Метод возвращает массив тех же чисел, умноженных на number
        Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    public int[] multiplyArrayByNumber(int[] array, int number) {
        int[] arrayMultiplied = new int[array.length];
        if(number != 0) {
            for(int i = 0; i < array.length; i++) {
                arrayMultiplied[i] = array[i] * number;
            }

            return arrayMultiplied;
        }

        return new int[] {0};
    }

    /* Task 6.Написать метод toDoubleArray(), который принимает на вход массив целых чисел,  и возвращает массив
    типа double[] из тех же чисел
    Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray(int[] array) {
        double[] arrayDouble = new double[array.length];
        if(array != null) {
            for(int i = 0; i < array.length; i++) {
                arrayDouble[i] = (double)array[i];
            }

            return arrayDouble;
        }

        return new double[] {0.0};
    }

    /* Task 7. Написать метод toIntArray(), который принимает на вход массив типа double[],  и возвращает массив
    типа int[] из тех же чисел
        Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    public int[] toIntArray(double[] array) {
        int[] arrayInt = new int[array.length];
        if(array != null) {
            for(int i = 0; i < array.length; i++) {
                arrayInt[i] = (int)array[i];
            }

            return arrayInt;
        }

        return new int[] {};
    }

    /* Task 8. Написать метод toStringArray(), который принимает на вход массив целых чисел,  и возвращает массив типа
    String[] из тех же чисел (желательно не использовать метод .toString(), нужно переводить вручную)
        Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */
    public String[] toStringArray(int[] array) {
        String[] arrayString = new String[array.length];
        if(array != null) {
            for(int i = 0; i < array.length; i++) {
                arrayString[i] = "" + array[i] + "";
            }

            return arrayString;
        }

        return new String[] {};
    }

    /* Task 9. Перегрузить метод toStringArray() параметром double[]. Этот метод должен возвращать массив типа
    String[] (желательно не использовать метод .toString(), нужно переводить вручную)
    Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    public String[] toStringArray(double[] array) {
        String[] arrayString = new String[array.length];
        if(array != null) {
            for(int i = 0; i < array.length; i++) {
                arrayString[i] = "" + array[i] + "";
            }

            return arrayString;
        }

        return new String[] {};
    }

    /* Task 12. В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(), который принимает на вход
    массив целых чисел и число number. Метод возвращает значение true, если все элементы массива больше number, иначе
    возвращает false
     */

    public boolean areValuesGreaterThanNumber(int[] array, int number) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] <= number) {

                return false;
            }
        }

        return true;
    }








}
