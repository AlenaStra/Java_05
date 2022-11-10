public class Intersection {

    /* Task 9. Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает массив
    общих элементов.
        Test Data:
        {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
        {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
        {1, 2, 4, 5, 89}, {8, 9, 45} → {}
     */

    public int[] intersection(int[] array1, int[] array2) {
        int newLength = 0;
        if (array1 != null && array2 != null) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        newLength++;
                    }
                }
            }
        }
        int[] intersection = new int[newLength];
        int element = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    intersection[element] = array1[i];
                    element++;
                }
            }
        }

        return intersection;
    }

}
