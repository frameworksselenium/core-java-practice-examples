import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateInt {
    public static void main(String[] args){

        //approach1
        int number = 123134254;
        System.out.println("Before  removing the duplicate characters " + number);
        String temp = Integer.toString(number);

        String noDuplicates = Arrays.asList(temp.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        System.out.println("After  removing the duplicate characters " + Integer.parseInt(noDuplicates));

        //loop Approach 2
        String result = "";
        for (int i = 0; i < temp.length(); i++) {
            String val = String.valueOf(temp.charAt(i));
            if(!result.contains(val)) {
                result += val;
            }
        }
        System.out.println("After  removing the duplicate characters " + Integer.parseInt(result));

        //approach 3
        HashSet set1 = new HashSet<>();
        char[] charArrray1 = temp.toCharArray();
        for(char c:charArrray1) {
            set1.add(c);
        }
        System.out.println("After  removing the duplicate characters " + set1);
    }
}
