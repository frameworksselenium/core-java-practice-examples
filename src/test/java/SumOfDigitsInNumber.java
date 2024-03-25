public class SumOfDigitsInNumber {

    public static void main(String[] args){

        int num =12345;
        int count = 0;
        while(num!=0){
            count = count + num%10;
             num = num / 10;
        }
        System.out.println("Sum of Digits in Number :" + count);

    }
}
