public class CountNoOfEvenOddNumbers {

    public static void main(String[] args){

        int num =12345;
        int evenCount = 0;
        int oddCount = 0;
        int rem = 0;
        while(num!=0){
            rem = num%10;

            if(rem%2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("No of Even Number :" + evenCount + " No of Odd number :" + oddCount);


    }
}
