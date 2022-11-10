import java.util.Arrays;

public class NegativeOnTheRight {

    /* Part2 Algorithms
    Task 13. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает
    массив,  в котором все негативные числа находятся во второй половине массива (массив не должен быть отсортирован)
        Test Data:
        {4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
     */

    public int[] negativeOnTheRight(int[] array) {
        int[] newArray = new int[array.length];
        int k = 0;
        int l = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                newArray[k] = array[i];
                k++;
            } else {
                newArray[l] = array[i];
                l--;
            }
        }
        return newArray;
    }
}
