import java.util.Random;

public class FactorialOfNumber {
    //A factorial is a function that multiplies a number by every number below it.
    public static void main(String[] args){

        int num = 5;
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact  = fact * i;
        }
        System.out.println("factorial :" + fact);
    }

}
