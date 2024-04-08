
public class PalindromeString {
    public static void main(String[] args){
        //approach1

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Please enter string");
        String value = scan.next();*/
        String value  = "Krishna";
        String rev="";
        for (int i=value.length()-1; i>=0; i--){
         rev = rev + value.charAt(i);
        }
        if(rev.equals(value)){
            System.out.println("given string is Palindrome : '" + value + "'");
        }else{
            System.out.println("given string is not Palindrome : '" + value + "'");
        }

        //approach2
        String reversedStr1 = new StringBuffer(value).reverse().toString();
        String reversedStr = new StringBuilder(value).reverse().toString();
        if(reversedStr.equals(value)){
                System.out.println("given string is Palindrome : '" + value + "'");
        }else{
            System.out.println("given string is not Palindrome : '" + value + "'");
        }
    }
}
