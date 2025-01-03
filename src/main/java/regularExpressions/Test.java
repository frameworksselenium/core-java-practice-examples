package regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {


        //find "ab" are available in given string
        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "ab" are available in given string
        int counter = 0;
        Pattern pattern0 = Pattern.compile("ab");
        Matcher matcher0 = pattern0.matcher("abbabbba");
        while(matcher0.find()){
            counter++;
            System.out.println(matcher0.start() + "----" + matcher0.group() + "----" + matcher0.end());
        }
        System.out.println("No of times matched given string "  + counter);


        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "ab" are available in given string
        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher("abc");
        boolean matches = matcher.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "a" followed by any character followed by "c"
        Pattern pattern1 = Pattern.compile("a.c");
        Matcher matcher1 = pattern1.matcher("abc");
        boolean matches1 = matcher1.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "a" followed by "b" or "c" followed by "d"
        Pattern pattern2 = Pattern.compile("a[bc]d");
        Matcher matcher2 = pattern2.matcher("abd");
        boolean matches2 = matcher2.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet

        Pattern pattern3 = Pattern.compile("a[b-d]e");
        Matcher matcher3 = pattern3.matcher("ace");
        boolean matches3 = matcher3.matches();  // returns true

        //negation
        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "a" followed by any character except "b", "c" or "d" followed by "e"
        Pattern pattern4 = Pattern.compile("a[^b-d]e");
        Matcher matcher4 = pattern4.matcher("age");
        boolean matches4 = matcher4.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find any digit
        Pattern pattern5 = Pattern.compile("\\d+");
        Matcher matcher5 = pattern5.matcher("123");
        boolean matches5 = matcher5.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find any non digit
        Pattern pattern6 = Pattern.compile("\\D+");
        Matcher matcher6 = pattern6.matcher("abc");
        boolean matches6 = matcher6.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find any white space
        Pattern pattern7 = Pattern.compile("\\s*");
        Matcher matcher7 = pattern7.matcher(" ");
        boolean matches7 = matcher7.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find any non white space
        Pattern pattern8 = Pattern.compile("\\S+");
        Matcher matcher8 = pattern8.matcher("abc");
        boolean matches8 = matcher8.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find any word character
        Pattern pattern81 = Pattern.compile("\\w+");
        Matcher matcher81 = pattern81.matcher("abc123");
        boolean matches81 = matcher81.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find any non word character
        Pattern pattern9 = Pattern.compile("\\W+");
        Matcher matcher9 = pattern9.matcher("@#%");
        boolean matches9 = matcher9.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "abc" at the start of the string
        Pattern p1attern = Pattern.compile("^abc");
        Matcher m1atcher = p1attern.matcher("abcdef");
        boolean m1atches = m1atcher.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "abc" at the end of the string
        Pattern pattern11 = Pattern.compile("abc$");
        Matcher matcher11 = pattern11.matcher("defabc");
        boolean matches11 = matcher11.matches();  // returns true

        Pattern pattern22 = Pattern.compile("a{3}");
        Matcher matcher22 = pattern22.matcher("aaa");
        boolean matches22 = matcher22.matches();  // returns true

        Pattern pattern2222 = Pattern.compile("a{2,}");
        Matcher matcher2222 = pattern2222.matcher("aaa");
        boolean matches2222 = matcher2222.matches();  // returns true

        Pattern pattern33 = Pattern.compile("a{2,3}");
        Matcher matcher33 = pattern33.matcher("aaa");
        boolean matches33 = matcher33.matches();  // returns true

        Pattern pattern44 = Pattern.compile("a+");
        Matcher matcher44 = pattern44.matcher("aaa");
        boolean matches44 = matcher44.matches();  // returns true

        Pattern pattern55 = Pattern.compile("a*");
        Matcher matcher55 = pattern55.matcher("");
        boolean matches55 = matcher55.matches();  // returns true

        Pattern pattern66 = Pattern.compile("a?");
        Matcher matcher66 = pattern66.matcher("");
        boolean matches66 = matcher66.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "abc" one or more times
        Pattern pattern77 = Pattern.compile("(abc)+");
        Matcher matcher77 = pattern77.matcher("abcabc");
        boolean matches77 = matcher77.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "abc" or "def"
        Pattern pattern88 = Pattern.compile("abc|def");
        Matcher matcher88 = pattern88.matcher("abc");
        boolean matches88 = matcher88.matches();  // returns true

        //write comment below code wha it is doing and what is the output of below code snippet and what is the output of above code snippet
        //find "$" in the given string
        Pattern pattern99 = Pattern.compile("\\$");
        Matcher matcher99 = pattern99.matcher("$");
        boolean matches99 = matcher99.matches();  // returns true

    }
}
