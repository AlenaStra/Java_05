public class OddIndices {

    /*Task 2.Написать алгоритм OddIndices, который принимает массив целых чисел,  и возвращает массив значений нечетных
     индексов
        Test Data:
        Input = {-45, 590, 234, 985, 12, 68}
        Expected Result =  {590, 985, 68}
     */

    public int[] oddIndices(int[] array) {
        if (array.length > 0) {
            int[] arrayOdd = new int[array.length / 2];
            int element = 0;
            for (int i = 1; i < array.length; i += 2) {
                arrayOdd[element] = array[i];
                element++;
            }
            return arrayOdd;
        }
        return new int[]{0};
    }
}
