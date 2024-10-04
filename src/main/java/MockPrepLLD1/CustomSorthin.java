package MockPrepLLD1;

import java.util.*;

public class CustomSorthin {

    public static void main(String[] args) {
         List<Integer> arr = new ArrayList<Integer>();
         arr.add(1);
         arr.add(2);
         arr.add(3);
         arr.add(4);
         arr.add(5);
         arr.add(6);
         arr.add(7);

        Collections.sort(arr, Comparator.reverseOrder());

        System.out.println(arr);
    }
}
