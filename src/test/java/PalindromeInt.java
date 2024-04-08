public class PalindromeInt {
    //reverse the number or string , after reverse it should match with original number or string
    public static void main(String[] args){

        //approach1
        int num = 121;

        int tempNum = num;
        int revNum = 0;
        while(num!=0){
            revNum = revNum*10 + num%10;
            num = num/10;
        }
        if(revNum == tempNum){
            System.out.println("given number is Palindrome : '" + tempNum + "'");
        }else{
            System.out.println("given number is not Palindrome : '" + tempNum + "'");
        }

        //approach2
        int num1 = 121;
        String str = Integer.toString(num1);
        //String str = String.valueOf(num1);
        String revStr="";
        for (int i=str.length()-1; i>=0; i--){
            revStr = revStr + str.charAt(i);
        }
        int revNum1 = Integer.parseInt(revStr);
        if(revNum1 == num1){
            System.out.println("given number is Palindrome : '" + tempNum + "'");
        }else{
            System.out.println("given number is not Palindrome : '" + tempNum + "'");
        }
    }
}