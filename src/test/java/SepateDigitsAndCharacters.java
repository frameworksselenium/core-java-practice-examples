

public class SepateDigitsAndCharacters {

    public static void main(String[] args){

        String str  = "hi123BasicJava3456";

        //approach1
        String digits = str.replaceAll("\\D+", "");
        String letters = str.replaceAll("\\d+", "");

        System.out.println("Digits: " + digits);
        System.out.println("Letters: " + letters);


        //approach 2
        String stringvalue = "";
        String intValue = "";
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                stringvalue  = stringvalue + c;
            } else if (Character.isLetter(c)) {
                intValue = intValue + c;
            }
        }
        System.out.println("Digits: " + stringvalue);
        System.out.println("Letters: " + intValue);
    }

}
