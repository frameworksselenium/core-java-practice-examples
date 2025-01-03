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

        //Logic5
        int array44[] = {23,56,1,2,3};
        array44 = Arrays.stream(array44).sorted().toArray();
        System.out.println("Values after sorting the array " + Arrays.toString(array44));

        //Logic6
        Integer[] array444 = Arrays.stream(array44).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
        System.out.println("Values after sorting the array " + Arrays.toString(array444));


        /// String sorting
        //logic1
        String[] array23 = {"Krishna", "Apple"};
        Arrays.sort(array23);
        System.out.println("After sorting array element order" + Arrays.toString(array23));

        //Logic2
        String[] array24 = {"Krishna", "Apple"};
        Arrays.sort(array24, Collections.reverseOrder());
        System.out.println("After sorting array element order" + Arrays.toString(array24));

        //Logic3
        //Reverse order
        String[] array2 = {"Krishna", "Apple"};
        List dd3 = Arrays.asList(array2);
        Collections.sort(dd3, Collections.reverseOrder());
        for (int i = 0; i < dd3.size(); i++) {
            System.out.println(dd3.get(i));
        }

        //logic4
        // Natural
        String[] array21 = {"Krishna", "Apple"};
        List dd4 = Arrays.asList(array21);
        Collections.sort(dd4);
        for (int i = 0; i < dd4.size(); i++) {
            System.out.println(dd4.get(i));
        }

        //Logic5
        String[] array26 = {"Krishna", "Apple"};
        String[] array27 = Arrays.stream(array26).sorted().toArray(String[]::new);
        System.out.println("Values after sorting the array " + Arrays.toString(array27));

        //Logic6
        String[] array28 = {"Krishna", "Apple"};
        String[] array29 = Arrays.stream(array28).sorted(Collections.reverseOrder()).toArray(String[]::new);
        System.out.println("Values after sorting the array " + Arrays.toString(array29));
    }
}
