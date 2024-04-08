import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumber {

    public static void main(String [] args){

        // find second height from an array

        //approach1
        // random numbers
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        int secondLargestNumber = Arrays
                .stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second height number is: " + secondLargestNumber);


        //approach2
        // print sum to console
        int[] numbers1 = {5, 9, 11, 2, 8, 21, 1};
        Arrays.sort(numbers1);
        int secondLargest = numbers1[numbers1.length - 2];
        System.out.println("Second largest number is: " + secondLargest);

        //approach3
        Integer[] array = {5, 9, 11, 2, 8, 21, 1};
        List<Integer> list = Arrays.asList(array);
        Collections.sort(list);
        System.out.println("Second height number is: " + list.get(list.size()-2));

        ///=========== // find second lowest from an array

        //approach1
        Arrays.sort(numbers);
        int secondLowest = numbers[1];
        System.out.println("Second lowest number is: " + secondLowest);

        //approach2
        Integer[] array1 = {5, 9, 11, 2, 8, 21, 1};
        List<Integer> list1 = Arrays.asList(array1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Second lowest    number is: " + list1.get(list.size()-1));

        //approach3
        int[] numbers11 = {5, 9, 11, 2, 8, 21, 1};
        int secondLowest1 = Arrays.stream(numbers11)
                .sorted()
                .skip(1)
                .findFirst()
                .getAsInt();
        System.out.println("Second lowest number is: " + secondLowest1);

    }


}
