public class MinMaxAve {

    /* Task 8. Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,  и среднее среди
    всех значений между 2-мя индексами.
        Test Data:
         ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public static int[] minMaxAve(int[] array, int element1, int element2) {
        int[] arrayMinMaxAve = new int[3];
        int min = Integer.MAX_VALUE;
        for (int i = element1; i <= element2; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            arrayMinMaxAve[0] = min;
        }

        int max = Integer.MIN_VALUE;
        for (int i = element1; i <= element2; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            arrayMinMaxAve[1] = max;
        }

        int sum = 0;
        for (int i = element1; i <= element2; i++) {
            sum += array[i];
            int ave = sum / (element2 - element1 + 1);
            arrayMinMaxAve[2] = ave;
        }

        return arrayMinMaxAve;
    }



}
