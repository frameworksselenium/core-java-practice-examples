package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindingSumOfLargestTwoNumbersUsingStreamLimitMethod {

    public static void main(String[] args) {

        Integer[] num = {5, 9,1,2};
        List<Integer> numbers = Arrays.asList(num);

        //Approach 1
        // find sum of largest 2 numbers using Stream.limit(); method
        int sum = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .reduce(0,  Integer::sum);
        System.out.println("The sum of 2 largest numbers in an Array is - " + sum);


        //Approach 2
        // sorting integers in reverse order using Comparator
        Collections.sort(numbers, new NumberComparator());
        int sum1 = 0;
        for(int index = 0; index < numbers.size() && index < 2; index++) {
            sum1 += numbers.get(index);
        }
        System.out.println("Before Java 8 - Sum of 2 largest numbers in an Array is - " + sum1);


        //Approach 3 - lowest numbers sum
        int array44[] = {23,56,1,2,3};
        long array4444 = Arrays.stream(array44).sorted().limit(2).sum();
        System.out.println("The sum of 2 largest numbers in an Array is - " + array4444);


        //Approach 4 - reverse order - highest numbers sum
        long array444 = Arrays.stream(array44).boxed().sorted(Collections.reverseOrder()).limit(2).mapToInt(Integer::intValue).sum();
        System.out.println("The sum of 2 largest numbers in an Array is - " + array444);

    }
}

