public class OddEvenValuesInArray {

    /* Part 1.1 Array
    Task 10. Написать метод countEvenValuesInArray(), который принимает на вход массив целых чисел,  и возвращает
    количество четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /* Task 11.Написать метод countOddValuesInArray(), который принимает на вход массив целых чисел,  и возвращает
    количество нечетных чисел в этом массиве
     */
    public int countOddValuesInArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }


}
