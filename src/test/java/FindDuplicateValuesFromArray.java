import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateValuesFromArray {


    public static void main(String[] args){

        int[] array = {12, 33, 56, 12, 33};

        //Delete Duplicate values from Array and get unique values
        //approach1
        int[] sss = Arrays.stream(array).distinct().toArray();

        //Approach2
        //find duplicate values
        //HashSet
        HashSet set1 = new HashSet();
        boolean status23 = false;
        for(int a:array){

            if(set1.add(a) == false){
                status23 = true;
                System.out.println("Found Duplicate element found using HashSet :" + a);
            }
        }
        if(status23==false){
            System.out.println("Duplicate element not found using HashSet");
        }

        //approach3
        boolean status = false;
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                  System.out.println("Found Duplicate element found :" + array[i]);
                  status = true;
                }
            }
        }
        if(status==false){
            System.out.println("Duplicate element not found");
        }


        //String Array
        String[] array1 = {"Java", ".Net", "Selenium", "Java"};

        //approach1
        List<String> ss = Arrays.stream(array1).distinct().collect(Collectors.toList());

        String[] ss1 = Arrays.stream(array1).distinct().toArray(String[]::new);
        String[] ss2 = Arrays.stream(array1).distinct().toArray((length) -> new String[length]);

        //approach2
        //HashSet
        String[] array2 = {"Java", ".Net", "Selenium", "Selenium"};
        HashSet set = new HashSet();
        boolean status2 = false;
        for(String a:array2){

            if(set.add(a) == false){
                System.out.println("Duplicate element found using HashSet :" + a);
                status2 = true;
            }
        }
        if(status2==false){
            System.out.println("Duplicate element not found using HashSet");
        }

        //approach3
        boolean status3 = false;
        for(int i=0; i<array2.length; i++){
            for(int j=i+1; j<array2.length; j++){
                String ival = array2[i];
                String jval = array2[j];
                if(ival.equals(jval)){
                    System.out.println("Duplicate element found using loop :" + array2[i]);
                    status3 = true;
                }
            }
        }
        if(status3==false){
            System.out.println("Duplicate element not found");
        }

    }
}
