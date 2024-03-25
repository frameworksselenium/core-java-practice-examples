public class SwappingInt {

    public static void main(String[] args){

        int val1 = 10;
        int val2 = 20;

        //Logic 1 with third variable
       /* int temp = val1;
        val1=val2;
        val2=temp;
        System.out.println("Value1 values is '" + val1 + "'");
        System.out.println("Value2 values is '" + val2 + "'");
        */

        //2 logic without third variable and with + -

       /* val1 = val1 + val2;//10+20=30
        val2 = val1 - val2;//30-20=10
        val1 = val1 - val2;//30-10=20
        System.out.println("Value1 values is '" + val1 + "'");
        System.out.println("Value2 values is '" + val2 + "'");*/

        //3 logic with * /
        /*val1 = val1 * val2;
        val2 = val1 / val2;
        val1 = val1 / val2;
        System.out.println("Value1 values is '" + val1 + "'");
        System.out.println("Value2 values is '" + val2 + "'");*/

        //4 logic with ^
       /* val1 = val1 ^ val2;//10+20=30
        val2 = val1 ^ val2;//30-20=10
        val1 = val1 ^ val2;//30-10=20
        System.out.println("Value1 values is '" + val1 + "'");
        System.out.println("Value2 values is '" + val2 + "'");*/

        //5 Single statment
        val2 = (val1 + val2) - (val1 = val2);
        System.out.println("Value1 values is '" + val1 + "'");
        System.out.println("Value2 values is '" + val2 + "'");

    }
}
