package set01;

import java.util.HashSet;

/** remove duplicates from an array */

public class QTwo {
    public static void main(String[] args) {
        int[] numbers = {1,2,4,2,3,1,5,3,4};
        removeDuplicates(numbers);
    }

    static void removeDuplicates(int[] numbers) {
        HashSet<Integer> list = new HashSet<>();
        for (int number : numbers) {
            list.add(number);
        }

        System.out.println(list.toString());
    }
}
