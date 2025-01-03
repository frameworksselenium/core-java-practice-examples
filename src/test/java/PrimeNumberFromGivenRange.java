
public class PrimeNumberFromGivenRange {
    //it shouls be > 1 and number should divisable with 1 or itself
    public static void main(String[] args){
        //To calculate the quotient and remainder of two numbers in Java,
        //you can use the division (/) and modulus (%) operators respectively.

        //List out Prime numbers from 1 to 100
        //2, 3, 5, 7, 11, 13, 17, 19 , 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

        //Approach 1
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.println(num);
            }
        }
    }
}
