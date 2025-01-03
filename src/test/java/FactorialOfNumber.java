import java.util.Random;

public class FactorialOfNumber {
    //Factorial means: multiply a number by every number below it.
    //write a program to find factorial of a number
    public static void main(String[] args){

        int num = 5;
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact  = fact * i;
        }
        System.out.println("factorial :" + fact);
    }

}
