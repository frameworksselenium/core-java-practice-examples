
public class PrimeNumberCheckGivenNumberIs {

    public static void main(String[] args){
        //Prime Number is ,  //it shouls be > 1 and number should be divisable with 1 or itself
        //find given number is prime number or not

        //Approach 1
        int num = 48;
        boolean isPrime = true;
        for(int i = 2; i * i <= num; i++){//more efficient, loop will run less iteration
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

        //Approach 2
        int d = 29;
        int c=0;
        if(d>1) {
            for (int i = 1; i <= d; i++) {//less efficient, loops all iterations
                if (d % i == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(d + " is a prime number");
            } else {
                System.out.println(d + " is not a prime number");
            }
        }else{
            System.out.println(d + " is not a prime number");
        }
    }

}
