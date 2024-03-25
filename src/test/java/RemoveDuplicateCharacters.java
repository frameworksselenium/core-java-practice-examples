import java.util.Arrays;
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
            if(!result.contains(String.valueOf(myString.charAt(i)))) {
                result += String.valueOf(myString.charAt(i));
            }
        }
        System.out.println("After  removing the duplicate characters " + result);

        //Set approach 3
        Set<Character> set = new LinkedHashSet<Character>();
        char[] charArrray = myString.toCharArray();
        for(char c:charArrray) {
            set.add(Character.valueOf(c));
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        System.out.println("After  removing the duplicate characters " + sb.toString());

    }
}
