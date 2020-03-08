/**
 * Created by Bartłomiej Skorowski on 09.01.2020.
 */
public class Calc {

    // typ zwracany (void) nazwaMetody(opcjonalne parametry) { return }

    //(5, 10) = 15

    int addTwoNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    void addAndPrint (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

        void addAndPrint2 (int x, int y) {
            int sum = addTwoNumbers(x, y);
            System.out.println(sum);
        }
    }





