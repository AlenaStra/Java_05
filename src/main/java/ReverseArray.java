public class ReverseArray {

    /* Task 11. Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает
    “перевернутый” массив.
                Test Data:
                {2, 7, 3, 10} → {10, 3, 7, 2}
     */

    public int[] reverseArray(int[] array) {
        int[] reverseArray = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[j] = array[i];
            j++;
        }
        return reverseArray;
    }


}
