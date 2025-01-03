public class ReplaceStringWithEmpty {


    public static void main(String [] args){

        String str = "abc abc abc";
        String f = "";
        for(int i = 0;i < str.length(); i++) {
            String value = Character.toString(str.charAt(i));
            if (value.equals("a")){
                value = "" ;
            }
            if (value.equals("c")){
                value = "" ;
            }
            f = f + value;
        }
        System.out.println("After Replace '" + f + "'");
    }
}
