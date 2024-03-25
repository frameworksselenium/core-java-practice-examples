import java.util.Arrays;
import java.util.HashSet;

public class GetDuplicateElementsStringAndCount {

    public static void main(String[] args){
        ///Solution:1
        //remove duplicates
        String[] strArry = {"Krishna", "Sritan", "Krishna", "Anusha", "Sritan"};
       HashSet set = new HashSet();
        for(String a:strArry){
            set.add(a);
        }

        for(Object s:set){
            String name1 = (String)s;
            int c = 0;
            for(int j=0; j<strArry.length; j++){
                String name2 = strArry[j];
                if(name1.equals(name2)){
                    c++;
                }
            }
            System.out.println("Name '" + name1 + "' has repeated '" + c + "' times");
        }



        ///Solution:2
        //sort
        int[] strArry1 = {2,5,7,3,4,3,2,1,1,7,1,1,1,};
        Arrays.sort(strArry1);
        //System.out.println("Array Values After sort : " + Arrays.toString(strArry1));


        for(int i=0; i<strArry1.length-1; i++){
            int c = 1;
            for(int j=i+1; j<strArry1.length; j++){
                if(strArry1[i] == strArry1[j]){
                    c++;
                }else{
                    break;
                }
            }
           // if(c>1 ) {
                System.out.println("Number '" + strArry1[i] + "' repeated '" + c + "' times");
                i+=(c-1);
            //}
        }
    }
}

