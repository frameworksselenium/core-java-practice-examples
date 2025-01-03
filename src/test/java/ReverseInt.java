import java.util.Scanner;
public class ReverseInt {

    public static void main(String[] args){

        //Approach 1
        //While Loop
        int num = 1234;
        int rev = 0;
       while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse Number with StringBuffer is :" + rev);

       //Approach 2
        num = 1234;
        //StringBuffer
        StringBuffer sbuff = new StringBuffer(String.valueOf(num));
        String revSBF = sbuff.reverse().toString();
        System.out.println("Reverse Number with StringBuffer is :" + revSBF);

        //Approach 3
        num = 1234;
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        String revSBL = sb.reverse().toString();
        System.out.println("Reverse Number with StringBuilder is :" + revSBL);

        //Approach 4
        //For Loop
        num = 1234;
        String newString = String.valueOf(num);
        char[] a = newString.toCharArray();
        int length = newString.length();
        String revStr = "";
        for(int i=length-1; i>=0; i--){
            revStr = revStr + a[i];
        }
        System.out.println("Reverse Number with Character Array is :" + revStr);
    }
}
