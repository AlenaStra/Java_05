package project_utils;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Utils {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static int taskN = 2;
    static String asterisk = " ********************** ";
    static String task = "Task # ";

    public static void task() {
        System.out.println(ANSI_PURPLE + asterisk + task + (taskN++) + asterisk + ANSI_RESET + "\n");
    }

    public static void convertTemperature(int tempC) {
        int tempF = tempC * 9 / 5 + 32;
        System.out.println(tempC + "\u2103 = " + tempF + "\u2109.");
    }

    public static String verifyEquals(int expectedResultInt, int actualResultInt) {
        if (expectedResultInt == actualResultInt) {
            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else {
            return "\u001B[31m" + "Fail" + "\u001B[0m";
        }
    }

    public static String verifyEquals(String expectedResultString, String actualResultString) {
        if (expectedResultString.equals(actualResultString)) {
            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else {
            return "\u001B[31m" + "Fail" + "\u001B[0m";
        }
    }

    public static String verifyEquals(double expectedResultDouble, double actualResultDouble) {
        if (expectedResultDouble == actualResultDouble) {
            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else {
            return "\u001B[31m" + "Fail" + "\u001B[0m";
        }
    }

    public static String verifyEquals(boolean expectedResultBoolean, boolean actualResultBoolean) {
        if (expectedResultBoolean == actualResultBoolean) {
            return "\u001B[32m" + "Pass" + "\u001B[0m";
        } else {
            return "\u001B[31m" + "Fail" + "\u001B[0m";
        }
    }

    public static int findRandomIntPos() {
        System.out.println("\n" + (int) (Math.random() * 99 + 1));
        return (int) (Math.random() * 99 + 1);
    }

    public static int findRandomIntNeg() {
        System.out.println("\n" + (int) (Math.random() * 99 - 99));
        return (int) (Math.random() * 99 - 99);
    }

    public static void printEvenNumbersPos(int l) {
        int length = 0;
        if (length <= l) {
            for (int i = 0; i < l * 2; i += 2) {
                System.out.print(i + "  ");
                length++;
            }
        }
    }

    public static void printEvenNumbersNeg(int l) {
        int length = 0;
        if (length <= l) {
            for (int i = 0; i > -l * 2; i -= 2) {
                System.out.print(i + "  ");
                length++;
            }
        }
    }

    public static double printRandomNumbers(int n, int m, int l) {
        int length = 0;
        for (int i = n; i <= m && length < l; ) {
            System.out.print((int) (Math.random() * (m + 1 - n)) + n + "  ");
            length++;
        }
        return 0;
    }

    public static String returnMonth(int number) {
        if (number > 0 && number < 13) {
            switch (number) {
                case 1:
                    return "Jan";
                case 2:
                    return "Feb";
                case 3:
                    return "Mar";
                case 4:
                    return "Apr";
                case 5:
                    return "May";
                case 6:
                    return "Jun";
                case 7:
                    return "Jul";
                case 8:
                    return "Aug";
                case 9:
                    return "Sep";
                case 10:
                    return "Oct";
                case 11:
                    return "Nov";
                case 12:
                    return "Dec";
            }
        }

        return "Error";
    }

    public static String returnDayOfTheWeek(int number) {
        if (number > 0 && number < 8) {
            switch (number) {
                case 1:
                    return "Mon";
                case 2:
                    return "Tues";
                case 3:
                    return "Wed";
                case 4:
                    return "Thu";
                case 5:
                    return "Fri";
                case 6:
                    return "Sat";
                case 7:
                    return "Sun";
            }
        }

        return "Error";
    }

    public static int returnDayOfTheWeek(String day) {

        switch (day) {
            case "Mon":
                return 1;
            case "Tue":
                return 2;
            case "Wed":
                return 3;
            case "Thu":
                return 4;
            case "Fri":
                return 5;
            case "Sat":
                return 6;
            case "Sun":
                return 7;
        }

        return 0;
    }

    public static int returnDate(int date) {
        if (date < 10) {
            String number = String.format("%03d", date);
            return Integer.valueOf(number); //добавляем ноль для 1-9
        } else {
            return date;
        }
    }

    public static int daysInMonth(int month, int year) {
        int numDays;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:

                return -1;
        }
        return numDays;
    }

    public static void printEightDaysFromDate(String day, int month, int date, int year) {

        int currentYear = year; //использовал для метода без агумета year. Для текущего года.

        if (returnDayOfTheWeek(day) == 0 ||
                returnMonth(month).equals("Error") ||
                month <= 0 || // лишнее т.к. уже проверяется в returnMonth
                date <= 0 ||
                date > (daysInMonth(month, year))) {

            System.out.println("Please enter correct data.");

        } else {
            int currentDay = returnDayOfTheWeek(day);
            int currentMonth = month;
            int currentDate = date;
// print day
            for (int i = 0; i <= 7; i++) {
                if (currentDay != 7) {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay++;
                } else {
                    System.out.print(returnDayOfTheWeek(currentDay) + ", ");
                    currentDay = 1;
                }
// print month + date
                if (currentDate <= daysInMonth(currentMonth, currentYear)) {
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                } else {
                    if (currentMonth != 12) {
                        currentMonth++;
                    } else {
                        currentMonth = 1;
                        currentYear = year + 1;
                    }
                    currentDate = 1;
                    System.out.println(returnMonth(currentMonth) + " " + returnDate(currentDate));
//                    System.out.println(" " + currentYear); //проверка года - закоментить
                    currentDate++;
                }
            }
        }
    }

    public static void findSequence(int start, int end, int step) {
        if (step != 0) {
            if (start >= 0 && start < end) {
                if (start % step == 0) {
                    for (int i = start; i <= end; i += step) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (int i = start + step - start % step; i <= end; i += step) {
                        System.out.print(i + " ");
                    }
                }
            } else if (start >= 0 && start > end) {
                if (start % step == 0) {
                    for (int i = start; i >= end; i += step) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (int i = start + step - start % step; i >= end; i += step) {
                        System.out.print(i + " ");
                    }
                }

            } else if (start < 0 && start > end) {
                if (start % step == 0) {
                    for (int i = start; i >= end; i += step) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (int i = start + step - start % step; i >= end; i += step) {
                        System.out.print(i + " ");
                    }
                }
            } else if (start < 0 && start < end) {
                if (start % step == 0) {
                    for (int i = start; i <= end; i += step) {
                        System.out.print(i + " ");
                    }
                } else {
                    for (int i = start + step - start % step; i <= end; i += step) {
                        System.out.print(i + " ");
                    }
                }
            }
        } else {
            System.out.println("Step is equal zero. Enter a valid step.");
        }
    }

    public static void printAverageInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println(average);
    }

    public static int printAverageInArray1(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        return (int) average;
    }

    public static int[] intersection(int[] array1, int[] array2) {
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
        System.out.println(newLength);
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
        System.out.println(Arrays.toString(intersection));
        return intersection;
    }


    public static String[] createArrayFromText(String sentence) {
        if (sentence != null) {
            String[] array = sentence.split(" ");

            return array;
        }
        return null;
    }

    public static int[] peakElement(int[] array) {
        int newLength = 0;
        for(int i = 0; i < array.length; i++) {
            if (i == 0) {
                if(array[i] > array[i+1]){
                    newLength++;
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i-1]) {
                    newLength++;
                }
            } else if (array[i] > array[i-1] && array[i] > array[i+1]) {
                newLength++;
            }
        }
        System.out.println(newLength);
        int[] peakElement = new int[newLength];
        int element = 0;
        for(int i = 0; i < array.length; i++) {
            if (i == 0) {
                if(array[i] > array[i+1]){
                    peakElement[element] = array[i];
                    element++;
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i-1]) {
                    peakElement[element] = array[i];
                    element++;
                }
            } else if (array[i] > array[i-1] && array[i] > array[i+1]) {
                peakElement[element] = array[i];
                element++;
            }
        }
        System.out.println(Arrays.toString(peakElement));
        return peakElement;
    }

    /* Task 12. Написать алгоритм SortArray, который принимает на вход массив целых чисел, и сортирует элементы
    массива в порядке возрастания.
     */
//Test Data:
//{4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}

    public static int[] sortArray(int[] array) {   // DOES NOT WORK
        int[] sortArray = new int[array.length];
        int min = array[0];
        int element = 0;
        for(int i = 0;  i < array.length; i++){
            for(int j = 0; j < sortArray.length; j++){
                if(array[i] < min) {
                    min = array[i];
                    sortArray[j] = min;
                }
            }
        }
        int[] tempArray = new int[array.length];
        for(int i = 0; i < tempArray.length; i++){
            if (array[i] != min) {
                tempArray[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(tempArray));
        System.out.println(Arrays.toString(sortArray));
        return sortArray;
    }

     public static int[] sortArray1(int[] array) {   // DOES NOT WORK
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

//    public static int[] sumOfTwo(int[] array, int n) {
//        int[] arrayPair = new int[2];
//        int length = 0;
//        for (int i = 0; i < array.length - 2; i++) {
//            for (int j = 1; j < array.length - 1; j++) {
//                if (array[i] + array[j] == n) {
//                    arrayPair[0] = array[i];
//                    arrayPair[1] = array[j];
//                    System.out.println(Arrays.toString(arrayPair));
//                    length++;
//                }
//            }
//        }
//        int[][] allPairs = new int[length][2];
//        int k = 0;
//        for (int i = 0; i < array.length - 2; i++) {
//            for (int j = 1; j < array.length - 1; j++) {
//                if (array[i] + array[j] == n) {
//                    arrayPair[0] = array[i];
//                    arrayPair[1] = array[j];
//                    allPairs[i][j] = arrayPair;
//                    System.out.println(Arrays.toString(arrayPair));
//                    length++;
//                }
//            }
//        }
//
//
//    }

    public static boolean isStringNotNullAndNotEmpty(String text) {
        if(text != null) {
            return !text.trim().isEmpty();
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
//        sumOfTwo(array,12);

        System.out.println(printRandomNumbers(1, 26, 1));




















    }


}
