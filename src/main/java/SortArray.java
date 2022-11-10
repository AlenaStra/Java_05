public class SortArray {

    /* Part 2 Algorithms
    Task 12. Написать алгоритм SortArray, который принимает на вход массив целых чисел, и сортирует элементы массива
     в порядке возрастания.
        Test Data:
        {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
     */
    public int[] sortArray(int[] array) {   // DOES NOT WORK
        int[] sortedArray = new int[array.length];
        if(array.length > 0) {
            for(int i = 0; i < array.length; i++) {
                for(int j = 1; j < array.length; j++) {
                    sortedArray[i] = Math.min(array[i],array[j]);
                }
            }
           return sortedArray;
        }
        return new int[] {};
    }

}
