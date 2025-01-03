public class SumOfDigitsInNumber {

    public static void main(String[] args){

        //approach1
        int num =12345;
        int count = 0;
        while(num!=0){
            count = count + num%10;
             num = num / 10;
        }
        System.out.println("Sum of Digits in Number :" + count);

        //approach2
        int num1 = 5555;
        String strNum = String.valueOf(num1);
        int sum = 0;
        for (char c : strNum.toCharArray()) {
            //convert chat to int
            int cc = Integer.parseInt(String.valueOf(c));
            //int cc = Character.getNumericValue(c);
            sum = sum + cc;
        }
        System.out.println("Sum of number: " + sum);
    }
}
