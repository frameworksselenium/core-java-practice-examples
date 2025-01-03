import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {

    public static void main(String[] args){

        String myString = "Krishna Reddy";
        System.out.println("Before removing the duplicate characters " + myString);

        //Streams approach 1
        String noDuplicates = Arrays.asList(myString.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
        System.out.println("After  removing the duplicate characters " + noDuplicates);


        // Single loop Approach 2
        String result = "";
        for (int i = 0; i < myString.length(); i++) {
            String val = String.valueOf(myString.charAt(i));
            if(!result.contains(val)) {
                result = result + val;
            }
        }
        System.out.println("After  removing the duplicate characters using loop " + result);


        //Set approach 3
        //Set<Character> set = new LinkedHashSet<Character>();
        HashSet set = new HashSet<>();
        //HashSet<Character> set = new HashSet<>();
        char[] charArrray = myString.toCharArray();
        for(char c:charArrray) {
            set.add(c);
        }
        System.out.println("After  removing the duplicate characters using Set " + set.toString());


        //Approach 4
        //remove the duplicate characters using String Builder
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()) {
            String cc = String.valueOf(c);
            if (sb.indexOf(cc) == -1) { // If character is not already in the StringBuilder, append it
                sb.append(c);
            }
        }
        System.out.println("After  removing the duplicate characters using String Builder " + sb.toString());


        //Approach 5
        //remove the duplicate characters using String Buffer
        StringBuffer sf = new StringBuffer();
        for (char c : myString.toCharArray()) {
            String cc = String.valueOf(c);
            if (sb.indexOf(cc) == -1) { // If character is not already in the StringBuilder, append it
                sb.append(c);
            }
        }
        System.out.println("After  removing the duplicate characters using String Buffer " + sb.toString());

    }
}
