import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMaxMinValueFromArray {

    public static void main(String[] args){

        int[] array = {12, 33, 56};

        //Logic1
        //
        // find max val
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Maximum Value from Array " + max);

        //find min val
        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Minimum Value from Array " + min);

        //Logic2
        Arrays.sort(array);
        int min11 = array[0];
        System.out.println("Given numbers, min Number is :" + min11);

        //max
        Arrays.sort(array);
        int max11 = array[array.length - 1];
        System.out.println("Given numbers, Largest Number is :" + max11);

        //logic 3
        // min
        int min1 = Arrays.stream(array).min().getAsInt();
        System.out.println("Minimum Value from Array " + min1);

        //max
        int max1 = Arrays.stream(array).max().getAsInt();
        System.out.println("Minimum Value from Array " + max1);

    }


}
