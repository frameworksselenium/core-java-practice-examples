import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class PrimeNumberFromGivenRange {
    //it shouls be > 1 and number should divisable with 1 or itself
    public static void main(String[] args){
//To calculate the quotient and remainder of two numbers in Java,
// //you can use the division (/) and modulus (%) operators respectively.
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.println(num);
            }
        }

    }
}
