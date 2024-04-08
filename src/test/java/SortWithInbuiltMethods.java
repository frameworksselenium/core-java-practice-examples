import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWithInbuiltMethods {

    public static void main(String [] args) {
        /////Numaric values sorting

        //logic1
        int[] array = {2, 8, 2, 1, 33, 1};
        System.out.println("Before sorting array element order" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting array element order" + Arrays.toString(array));

        //logic2
        Integer[] array22 = {2, 8, 2, 1, 33, 1};
        System.out.println("Before sorting array element order" + Arrays.toString(array22));
        Arrays.sort(array22, Collections.reverseOrder());
        System.out.println("After sorting array element order" + Arrays.toString(array22));

        //logic3
        Integer[] array1 = {2, 8, 2, 1, 33, 1};
        List dd = Arrays.asList(array1);
        Collections.sort(dd);
        for (int i = 0; i < dd.size(); i++) {
            System.out.println(dd.get(i));
        }

        //logic4
        Integer[] array12 = {2, 8, 2, 1, 33, 1};
        List dd22 = Arrays.asList(array12);
        Collections.sort(dd22, Collections.reverseOrder());
        for (int i = 0; i < dd22.size(); i++) {
            System.out.println(dd22.get(i));
        }

        /// String sorting
        //logic1
        //Reverse order
        String[] array2 = {"Krishna", "Apple"};
        List dd3 = Arrays.asList(array2);
        Collections.sort(dd3, Collections.reverseOrder());
        for (int i = 0; i < dd3.size(); i++) {
            System.out.println(dd3.get(i));
        }

        //logic2
        // Natural
        String[] array21 = {"Krishna", "Apple"};
        List dd4 = Arrays.asList(array21);
        Collections.sort(dd4);
        for (int i = 0; i < dd4.size(); i++) {
            System.out.println(dd4.get(i));
        }

    }
}
