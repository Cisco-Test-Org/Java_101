package set02;

import java.util.Arrays;

/** Anagrams
 * Two words are anagrams if they contain the same letters but in a different order.
 * */

public class QSix {

    public static void main(String[] args) {
        var first = "listen";
        var second = "silent";

        char[] firstArray = stringToSortedArray(first);
        char[] secondArray = stringToSortedArray(second);

        System.out.println(Arrays.equals(firstArray, secondArray) ?
                "Anagram" : "Not an Anagram");

    }

    public static char[] stringToSortedArray(String string) {
        char[] array = string.toLowerCase().toCharArray();
        Arrays.sort(array);
        return array;
    }
}
