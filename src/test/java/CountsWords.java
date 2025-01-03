import java.util.Arrays;
import java.util.StringTokenizer;

public class CountsWords {
    //
    public static void main(String[] args){

        String str = "Hello Krishna Reddy";

        //logic1
        String[] splitStr = str.split(" ");
        int noOfWords = splitStr.length;
        System.out.println("Logic1-No Of Words :" + noOfWords);

        //Logic2
        int counte=1;
        for(int i=0; i<str.length()-1; i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1) != ' ')){
                counte++;
            }
        }
        System.out.println("Logic2-No Of Words :" + counte);

        //Logic3
        String str1 = "Hello Krishna Reddy";
        StringTokenizer st = new StringTokenizer(str1);
        System.out.println("Number of words: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        //Logic4
        String str2 = "Hello Krishna Reddy";
        long count = Arrays.stream(str2.split(" ")).count();
        System.out.println("Number of words: " + count);

    }
}
