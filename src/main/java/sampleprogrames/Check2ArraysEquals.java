package sampleprogrames;
import java.util.Arrays;

public class Check2ArraysEquals {

    public static void main(String[] args){

        int[] array1 = {12, 1, 56};
        int[] array2 = {12, 56, 1};
        Arrays.sort(array2);
        Arrays.sort(array1);
        for(int s:array1) {
            System.out.println(s);
        }

        //with Arrays class
        boolean isEquals = Arrays.equals(array1, array2);
        if(isEquals) {
            System.out.println("2 Arrays are same");
        }else{
            System.out.println("2 Arrays are not same");
        }

        //with loop
        int array1length = array1.length;
        int array2length = array2.length;
        boolean status = true;
        if (array1length == array2length){

            for(int i=0; i<=array1length-1; i++){
                int val1 = array1[i];
                int val2 = array2[i];
                if(val2!=val1){
                    status = false;
                }
            }
        }else{
            status = false;
        }
        if(status){
            System.out.println("2 Arrays are same with For Loop");
        }else{
            System.out.println("2 Arrays are not same with For Loop");
        }

    }
}
