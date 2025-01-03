public class Conversion {


    public static void main(String[] args){

        //convert string to integer different ways
        String str = "123";
        int num1 = Integer.parseInt(str);
        int num2 = Integer.valueOf(str);


        //convert integer to string different ways
        int num = 123;
        String str1 = String.valueOf(num);
        String str2 = Integer.toString(num);
        String str3 = "" + num;
        String str4 = String.format("%d", num);

        //convert Char to integer different ways
        char ch = 'A';
        int num5 = ch;
        char ch0 = 'A';
        int num7 = Integer.valueOf(ch0);
        int num8 = Integer.parseInt(String.valueOf(ch0));

        //convert integer to char different ways
        int num11 = 65;
        char ch1 = (char) num11;
        char ch4 = (char) Integer.parseInt(String.valueOf(num11));
        char ch5 = (char) Integer.parseInt(Integer.toString(num11));


        //convert string to char different ways
        String str5 = "A";
        char ch7 = str5.charAt(0);
        char ch8 = str5.toCharArray()[0];


        //convert char to string different ways
        char ch9 = 'A';
        String str6 = String.valueOf(ch9);
        String str7 = Character.toString(ch9);
        String str8 = "" + ch9;
        String str9 = String.format("%c", ch9);


        //convert string to double different ways
        String str10 = "123.45";
        double num12 = Double.parseDouble(str10);
        double num13 = Double.valueOf(str10);
        double num14 = Double.valueOf(str10).doubleValue();

        //convert double to string different ways
        double num15 = 123.45;
        String str11 = String.valueOf(num15);
        String str12 = Double.toString(num15);
        String str13 = "" + num15;
        String str14 = String.format("%f", num15);

        //convert string to float different ways
        String str15 = "123.45";
        float num16 = Float.parseFloat(str15);
        float num17 = Float.valueOf(str15);
        float num18 = Float.valueOf(str15).floatValue();

        //convert float to string different ways
        float num19 = 123.45f;
        String str16 = String.valueOf(num19);
        String str17 = Float.toString(num19);
        String str18 = "" + num19;
        String str19 = String.format("%f", num19);


        //convert string to long different ways
        String str20 = "123";
        long num20 = Long.parseLong(str20);
        long num21 = Long.valueOf(str20);
        long num22 = Long.decode(str20);
        long num23 = Long.valueOf(str20).longValue();


        //convert long to string different ways
        long num24 = 123;
        String str21 = String.valueOf(num24);
        String str22 = Long.toString(num24);
        String str23 = "" + num24;
        String str24 = String.format("%d", num24);


        //convert string to short different ways
        String str25 = "123";
        short num25 = Short.parseShort(str25);
        short num26 = Short.valueOf(str25);
        short num27 = Short.decode(str25);
        short num28 = Short.valueOf(str25).shortValue();


        //convert short to string different ways
        short num29 = 123;
        String str26 = String.valueOf(num29);
        String str27 = Short.toString(num29);
        String str28 = "" + num29;
        String str29 = String.format("%d", num29);

    }

}
