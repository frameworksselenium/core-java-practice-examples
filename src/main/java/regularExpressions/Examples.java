package regularExpressions;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Examples {

    public static void main(String args[]){
        //approach1 to write regular expressions
        boolean reg = Pattern.matches("abc", "abc"); // returns true
        System.out.println(reg);

        //approach2 to write regular expressions
        Pattern p = Pattern.compile("abc");
        Matcher m = p.matcher("abc");
        boolean reg1 = m.matches();
        System.out.println(reg1);

        //approach3 to write regular expressions
        boolean reg2 = Pattern.compile("abc").matcher("abc").matches();
        System.out.println(reg2);



        String str = "Krishna@#$% Reddy09 Manubolu";

        //remove all characters except alphabets and numbers which means remove all special characters and spaces
        String afterRegExp = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(afterRegExp);

        // remove all characters except alphabets
        String afterRegExp1 = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(afterRegExp1);

        //replace where ever digits are available with XX
        String text = "Hello, my name is John Doe. I am 25 years old. I live in New York.";
        String regex = "\\d+";
        String replacement = "";
        String result = text.replaceAll(regex, replacement);
        System.out.println(result);
        //
        String text2 = "Hello, my name is John Doe. I am 25 years old. I live in New York.";
        String regex2 = "\\b\\w{3}\\b";
        String replacement2 = "XX";
        String result2 = text2.replaceAll(regex2, replacement2);
        System.out.println(result2);

    }
}
