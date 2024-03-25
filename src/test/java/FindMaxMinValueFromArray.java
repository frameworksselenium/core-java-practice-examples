import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMaxMinValueFromArray {

    public static void main(String[] args){

        int[] array = {12, 33, 56};

        //find max val
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

        //logic 3

        int min1 = Arrays.stream(array).min().getAsInt();
        System.out.println("Minimum Value from Array " + min1);


        int max1 = Arrays.stream(array).max().getAsInt();
        System.out.println("Minimum Value from Array " + max1);

    }


}
