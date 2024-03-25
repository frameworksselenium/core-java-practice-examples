import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateInt {
    public static void main(String[] args){
        int number = 123134254;
        System.out.println("After  removing the duplicate characters " + number);
        String temp = Integer.toString(number);

        //Streams approach 1
        String noDuplicates = Arrays.asList(temp.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        System.out.println("After  removing the duplicate characters " + Integer.parseInt(noDuplicates));

        //loop Approach 2
        String result = "";
        for (int i = 0; i < temp.length(); i++) {
            if(!result.contains(String.valueOf(temp.charAt(i)))) {
                result += String.valueOf(temp.charAt(i));
            }
        }
        System.out.println("After  removing the duplicate characters " + Integer.parseInt(result));

        //Set approach 3
        Set<Character> set = new LinkedHashSet<Character>();
        char[] charArrray = temp.toCharArray();
        for(char c:charArrray) {
            set.add(Character.valueOf(c));
        }
        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        System.out.println("After  removing the duplicate characters " + Integer.parseInt(sb.toString()));

    }
}
