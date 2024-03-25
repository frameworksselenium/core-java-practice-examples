import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithInbuiltMethods {

    public static void main(String [] args) {

        //logic1
        int[] array = {2, 8, 2, 1, 33, 1};
        System.out.println("Before sorting array element order" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting array element order" + Arrays.toString(array));

        //logic1
        Integer[] array22 = {2, 8, 2, 1, 33, 1};
        System.out.println("Before sorting array element order" + Arrays.toString(array22));
        Arrays.sort(array22, Collections.reverseOrder());
        System.out.println("After sorting array element order" + Arrays.toString(array22));


        Integer[] array1 = {2, 8, 2, 1, 33, 1};
        List dd = Arrays.asList(array1);
        Collections.sort(dd);
        for (int i = 0; i < dd.size(); i++)
           System.out.println(dd.get(i));

        String[] array2 = {"Krishna", "Aple"};
        List dd2 = Arrays.asList(array2);
        Collections.sort(dd2, Collections.reverseOrder());
        for (int i = 0; i < dd2.size(); i++)
            System.out.println(dd2.get(i));

    }
}
