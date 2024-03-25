import java.util.Random;

public class RandomNumbersGeneration {

    public static void main(String[] args){
        //method1
        Random rand = new Random();
        int randNumber = rand.nextInt(6666666);
        System.out.println(randNumber);
        //method2
        System.out.println(Math.random());
    }

}
