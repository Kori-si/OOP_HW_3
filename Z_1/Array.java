package Z_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(1234561);
        arr.add(12);
        arr.add(123);
        arr.add(1234);

        Collections.sort(arr, new Metod());

        System.out.println(arr);

    }
}
