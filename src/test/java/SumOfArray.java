import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArray {
    //A series of numbers which each number is the sum of the 2 preceding number
    public static void main(String[] args){

        //approach1
        int[] array = {12, 12, 56};
        int sum =0;
        for(int a:array){
            sum = sum+a;
        }
        System.out.println("Sum of Array Element :" + sum);

        //approach2
        int sum1 = Arrays.stream(array).sum();
        System.out.println("Sum of Array Element :" + sum1);

    }
}
