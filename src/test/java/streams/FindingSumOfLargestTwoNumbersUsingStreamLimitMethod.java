package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindingSumOfLargestTwoNumbersUsingStreamLimitMethod {

    public static void main(String[] args) {
        Integer[] num = {5, 9};
        // random numbers
        List<Integer> numbers = Arrays.asList(num);

        //Approach 1
        // find sum of largest 2 numbers using Stream.limit(); method
        int sum = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce(0,  Integer::sum);
        // print sum to console
        System.out.println("The sum of 2 largest numbers in an Array is - "
                + sum);

        //Approach 2
        // sorting integers in reverse order using Comparator
        Collections.sort(numbers, new NumberComparator());

        // variable sum
        int sum1 = 0;
        // summing first 2 largest numbers
        for(int index = 0; index < numbers.size() && index < 2; index++) {
                sum1 += numbers.get(index);
        }
        // print sum to console
        System.out.println("Before Java 8 - Sum of 2 largest numbers in an Array is - " + sum1);
    }
}

