import java.util.Arrays;

public class SortBubble {

    public static void main(String[] args){

        int array[] = {23,56,1,2,3};
        int ss = array.length-1;
        for(int i=0; i<ss; i++){

            for(int j=0; j<ss; j++){

                if(array[j]>array[j+1]){
                    int tem=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tem;
                }
            }
        }
        System.out.println("Values after sorting the array " + Arrays.toString(array));
    }
}
