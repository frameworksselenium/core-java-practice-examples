public class CountNoOfDigits {
    //count number of digits in a given number
    public static void main(String[] args){

        int num11 = 123456;

        int count11=0;
        while(num11!=0){
            num11 = num11/10;
            count11++;
        }
        System.out.println("Number of Digits in given number :" + count11);


        //solution 2
        int num =12345;
        int counter = Integer.toString(num).length();
        System.out.println("Number of Digits in given number :" + counter);

    }
}
