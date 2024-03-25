public class FindLargestNumber {
    public static void main(String[] args){

        int num1 = 100;
        int num2 = 60;
        int num3 = 30;

        //Logic1
        if(num1>num2 && num1>num3){
            System.out.println("Given 3 numbers, Largest Number is :" + num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Given 3 numbers, Largest Number is :" + num2);
        }else{
            System.out.println("Given 3 numbers, Largest Number is :" + num3);
        }

        //Logic2
        //int largestNumber2 = num1>num2?num1:num2;
        //System.out.println("Given 2 numbers, Largest Number is :" + largestNumber2);

        //Logic3
        int largestNumber1 = num1>num2?num1:num2;
        int largestNumber23 = largestNumber1>num3?largestNumber1:num3;
       System.out.println("Given 3 numbers, Largest Number is :" + largestNumber23);

        //Logic3
        int largestNumber = (num1>num2?num1:num2)>num3?(num1>num2?num1:num2):num3;
        System.out.println("Given 3 numbers, Largest Number is :" + largestNumber);
    }


}
