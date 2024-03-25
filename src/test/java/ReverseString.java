public class ReverseString {
    public static void main(String[] args){

        String num = "Krishna Reddy";
        int rev = 0;

        //StringBuffer
        StringBuffer sbuff = new StringBuffer(String.valueOf(num));
        StringBuffer revSBF = sbuff.reverse();
        System.out.println("Reverse String with StringBuffer is :" + revSBF);

        //StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder revSBL = sb.reverse();
        System.out.println("Reverse String with StringBuilder is :" + revSBL);

        //For Loop
        String newString = num;
        String revStr = "";
        int length = newString.length();
        for(int i=length-1; i>=0; i--){
            revStr = revStr + newString.charAt(i);
        }
        System.out.println("Reverse String with For loop is :" + revStr);


        String newString1 = num;
        char[] a = newString.toCharArray();
        int length1 = newString.length();
        String revStr1 = "";
        for(int i=length1-1; i>=0; i--){
            revStr1 = revStr1 + a[i];
        }
        System.out.println("Reverse String with Character Array is :" + revStr1);

    }
}
