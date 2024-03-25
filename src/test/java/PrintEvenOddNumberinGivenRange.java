import java.util.ArrayList;
import java.util.Scanner;

public class PrintEvenOddNumberinGivenRange {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int lower=sc.nextInt();
        int upper=sc.nextInt();
        ArrayList<Integer> even =new ArrayList<>();
        ArrayList<Integer> odd =new ArrayList<>();
        for(int n=lower; n<=upper; n++){
            //int c = 0;
            if (n % 2 == 0) {
                even.add(n);
            }else{
                odd.add(n);
            }
        }
        System.out.println("Even Number " + even);
        System.out.println("Odd Number " + odd);
    }
}
