import java.util.HashSet;

public class FindDuplicateValuesFromArray {

    public static void main(String[] args){

        int[] array = {12, 33, 56, 12};
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
            System.out.println("Found Duplicate element not found");
        }

        //String Array
        String[] array1 = {"Java", ".Net", "Selenium", "Java"};
        boolean status1 = false;
        for(int i=0; i<array1.length; i++){
            for(int j=i+1; j<array1.length; j++){
                if(array1[i] == array1[j]){
                    System.out.println("Found Duplicate element found :" + array1[i]);
                    status1 = true;
                }
            }
        }
        if(status1==false){
            System.out.println("Found Duplicate element not found");
        }

        //HashSet
        String[] array2 = {"Java", ".Net", "Selenium", "Selenium"};
        HashSet set = new HashSet();
        boolean status2 = false;
        for(String a:array2){

            if(set.add(a) == false){
                System.out.println("Found Duplicate element found using HashSet :" + a);
                status2 = true;
            }
        }
        if(status2==false){
            System.out.println("Found Duplicate element not found using HashSet");
        }

    }
}
