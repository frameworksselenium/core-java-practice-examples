
public class FindOccurrenceOfGivenChar {

    public static void main(String[] args){
// find given character occurrence in given string
        String str = "Hello";
        String digit = "l";


        //logic1
        int beforeLength = str.length();
        String newStr = str.replace("l", "");
        int afterLength = newStr.length();

        int occurrence = beforeLength-afterLength;
        System.out.println("No o Occurrence :" + (beforeLength-afterLength));

        //logic 2
        int counter=0;
        for(int i=0; i<str.length(); i++){
            String digi = Character.toString(str.charAt(i));

            //String digi = String.valueOf(str.charAt(i));
            if(digi.equals(digit)){
                counter++;
            }
        }
        System.out.println("No o Occurrence :" + counter);

        //logic 3
        String str1 = "Hello";
        char ch = 'l';
        int count = 0;
        for (char c : str1.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        System.out.println("No of Occurrence :" + count);

    }
}
