public class OddEven {

    /* Task 1. В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число, возвращает “Odd”,
    если число нечетное, и “Even”, если число четное.
        Test Data:
        -345 →  “Odd”
        0 →  “Even”
        222222 →  “Even”
     */

    public String oddEven(int a) {
        if(a % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }



}