package Z_1;

import java.util.Comparator;

public class Metod implements Comparator<Integer>{

    @Override
    public int compare(Integer i, Integer j) {
        return Integer.compare(i % 10, j % 10);
    }
}
