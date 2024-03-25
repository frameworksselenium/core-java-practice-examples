public class PrimeNumberCheckGivenNumberIs {

    public static void main(String[] args){
        //it shouls be > 1 and number should divisable with 1 or itself
        int num = 29;
        int count = 0;
        if(num>1){
            for(int i=1; i<=num; i++){
                if(num%i == 0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("Given Number is Prime Number :" + num);
            }else{
                System.out.println("Given Number is not Prime Number :" + num);
            }
        }else{
            System.out.println("Given Number is not Prime Number :" + num);
        }

    }

}
