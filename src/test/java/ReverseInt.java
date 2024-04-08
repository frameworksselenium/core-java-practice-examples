import java.util.Scanner;
public class ReverseInt {
    public static void main(String[] args){

        int num = 1234;

        int rev = 0;

        //While Loop
       while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse Number with StringBuffer is :" + rev);
        num = 1234;
        //StringBuffer
        StringBuffer sbuff = new StringBuffer(String.valueOf(num));
        StringBuffer revSBF = sbuff.reverse();
        System.out.println("Reverse Number with StringBuffer is :" + revSBF);

        num = 1234;
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder revSBL = sb.reverse();
        System.out.println("Reverse Number with StringBuilder is :" + revSBL);

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
