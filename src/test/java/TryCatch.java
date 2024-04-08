import java.io.FileNotFoundException;

public class TryCatch {

    public static void main(String[] args){
        //only try can not write it will give error, try catch or try finally need to write
        try{
           System.out.println("HI");
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException or ArithmeticException");
        }finally{
            System.out.println("Finally block");
        }
    }
}
