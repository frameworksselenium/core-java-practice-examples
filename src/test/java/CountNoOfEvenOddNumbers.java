public class CountNoOfEvenOddNumbers {
    // Write a program to count the number of even and odd digits in a number
    public static void main(String[] args){

        //Approach 1
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

        //Approach 2
            int num1 = 12345;

            long evenCount1 = String.valueOf(num1)
                    .chars()
                    .map(Character::getNumericValue)
                    .filter(n -> n % 2 == 0)
                    .count();

            long oddCount1 = String.valueOf(num1)
                    .chars()
                    .map(Character::getNumericValue)
                    .filter(n -> n % 2 != 0)
                    .count();

            System.out.println("No of Even Number :" + evenCount1 + " No of Odd number :" + oddCount1);
    }
}
