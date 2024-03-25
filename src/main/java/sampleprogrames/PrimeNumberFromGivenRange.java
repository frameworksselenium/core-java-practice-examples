import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class PrimeNumberFromGivenRange {
    //it shouls be > 1 and number should divisable with 1 or itself
    public static void main(String[] args){

        for(int i=1; i<=100; i++) {
            boolean isprime = true;
            if (i>1) {
                for (int j = 2; j<i; j++) {
                    if (i%j == 0) {
                        isprime = false;
                    }
                }
            } else{
                isprime = false;
            }
            if(isprime){
                System.out.println(i + "");
            }
        }
    }
}
