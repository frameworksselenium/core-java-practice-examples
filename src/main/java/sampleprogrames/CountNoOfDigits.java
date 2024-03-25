public class CountNoOfDigits {

    public static void main(String[] args){

        int num =12345;
        int counter = 0;
        while(num!=0){
            num = num/10;
            counter++;
        }
        System.out.println("Number of Digits in given number :" + counter);
    }
}
