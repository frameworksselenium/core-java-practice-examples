import java.util.Arrays;
import java.util.HashSet;

public class GetDuplicateElementsStringAndCount {

    // Find duplicate elements in an array and print the count of each element
    public static void main(String[] args){

        ///Solution:1
       String[] strArry = {"Krishna", "Sritan", "Krishna", "Anusha", "Sritan"};
       HashSet<String> set = new HashSet();
        for(String a:strArry){
            set.add(a);
        }

        for(String s:set){
            String name1 = s;
            int c = 0;
            for(int j=0; j<strArry.length; j++){
                String name2 = strArry[j];
                if(name1.equals(name2)){
                    c++;
                }
            }
            if(c>1){
                System.out.println("Name '" + name1 + "' has repeated '" + c + "' times");
            }
        }


        //for integers
        Integer[] strArry11 = {2,2,2,1,1,3,4,3,3};
        Arrays.sort(strArry11);

        HashSet<Integer> set1 = new HashSet();
        for(Integer a:strArry11){
            set1.add(a);
        }

        for(Integer s:set1){
            Integer name1 = s;
            int c = 0;
            for(int j=0; j<strArry11.length; j++){
                int name2 = strArry11[j];
                if(name1 == name2){
                    c++;
                }
            }
            if(c>1){
                System.out.println("Name '" + name1 + "' has repeated '" + c + "' times");
            }
        }
    }
}

