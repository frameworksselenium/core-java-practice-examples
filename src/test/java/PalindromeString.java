import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string");
        String value = scan.next();*/
        String value  = "KRK";
        String rev="";
        for (int i=value.length()-1; i>=0; i--){
         rev = rev + value.charAt(i);
        }
        if(rev.equals(value)){
            System.out.println("given string is Palindrome : '" + value + "'");
        }else{
            System.out.println("given string is not Palindrome : '" + value + "'");
        }
    }
}
