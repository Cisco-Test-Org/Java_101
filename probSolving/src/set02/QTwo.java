package set02;


import java.util.Arrays;

/** An anagram
 * is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once. */

public class QTwo {
    public static void main(String[] args) {
        String first = "deal";
        String second = "lead";

        System.out.println(checkAnagram(first, second));

    }

    static boolean checkAnagram(String first, String second) {

        boolean condition;

        char[] fst = first.toCharArray();
        char[] scd = second.toCharArray();

        Arrays.sort(fst);
        Arrays.sort(scd);

        condition = Arrays.equals(fst, scd);

        return condition;

    }

}
