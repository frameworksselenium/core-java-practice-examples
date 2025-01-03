public class ReverseWordInString {

    public static void main(String[] args) {

        String s="My Name Is Lakshmipoojitha";

        String[] words= s.split(" ");
        String reverseString="";
        for(String w:words) {
            String reverseword ="";
            for(int i=w.length()-1;i>=0;i--) {
                reverseword = reverseword + w.charAt(i);
            }
            reverseString = reverseString + reverseword + " ";
        }
        System.out.print(reverseString);
    }

}