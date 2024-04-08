public class PrimeNumberCheckGivenNumberIs {

    public static void main(String[] args){
        //Prime Number is, it should be divisable with 1 or itself
        //find given number is prime number or not
        //List out Prime numbers from 1 to 100
        //2, 3, 5, 7, 11, 13, 17, 19 , 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
        int num = 1;
        boolean isPrime = true;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime && num > 1){
            System.out.println("Given Number is Prime Number :" + num);
        }else{
            System.out.println("Given Number is not Prime Number :" + num);
        }
    }

}
