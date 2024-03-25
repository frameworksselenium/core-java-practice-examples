package streams;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer int1, Integer int2) {
        return int2 - int1;
    }
}