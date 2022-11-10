import java.util.Arrays;

public class PeakElement {

    /* Task 10. Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения
    пиковых элементов (элементы, которые больше своих соседей).
        Test Data:
        {3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}
     */

    public int[] peakElement(int[] array) {
        int newLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    newLength++;
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    newLength++;
                }
            } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                newLength++;
            }
        }
        int[] peakElement = new int[newLength];
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    peakElement[element] = array[i];
                    element++;
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    peakElement[element] = array[i];
                    element++;
                }
            } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                peakElement[element] = array[i];
                element++;
            }
        }

        return peakElement;
    }
}
