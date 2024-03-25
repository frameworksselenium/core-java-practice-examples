import java.util.ArrayList;

public class SumOfArray {
    //A series of numbers which each number is the sum of the 2 preceding number
    public static void main(String[] args){

        int[] array = {12, 12, 56};
        int sum =0;
        for(int a:array){
            sum = sum+a;
        }
        System.out.println("Sum of Array Element :" + sum);
    }
}
