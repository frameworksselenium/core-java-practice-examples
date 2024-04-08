import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FibonacciSeriesGeneration {
    //A series of numbers which each number is the sum of the 2 preceding number
    public static void main(String[] args) {

        int endNumber = 10;
        int num1 = 0, num2 = 1, sum = 0;
        ArrayList<Integer> fs = new ArrayList<>();
        for (int n = 1; n <= endNumber; n++) {
            sum = num1 + num2;
            fs.add(sum);
            num1 = num2;
            num2 = sum;
        }
        System.out.println("Fibonacci numbers " + fs);

    }
}
