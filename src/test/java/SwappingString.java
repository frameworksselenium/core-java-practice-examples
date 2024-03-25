public class SwappingString {

    public static void main(String[] args){

        String  val1 = "Krishna";
        String val2 = "Reddy";

        //Logic 1 with third variable
        /*String temp = val1;
        val1=val2;
        val2=temp;
        System.out.println("Value1 values is '" + val1 + "'");
        System.out.println("Value2 values is '" + val2 + "'");
        */
        //Logic 2 with Concat
        val1 = val1 + val2;
        val2 = val1.substring(0, (val1.length() - val2.length()));
        val1 = val1.substring(val2.length());
        System.out.println("Value1 values is '" + val1 + "'");
        System.out.println("Value2 values is '" + val2 + "'");


        String  a = "We";
        String b = "are";

        a = a+b;
        b = a.substring(0, a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("Value1 values is '" + a + "'");
        System.out.println("Value2 values is '" + b + "'");
    }
}
