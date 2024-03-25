public class PalindromeInt {
    //reverse the number or string , after reverse it should match with original number or string
    public static void main(String[] args){

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
    }
}