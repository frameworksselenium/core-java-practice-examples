import java.util.ArrayList;

public class FibonacciSeriesGeneration {
        //The Fibonacci series is a sequence of numbers in which
    // each number is the sum of the two preceding ones
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
