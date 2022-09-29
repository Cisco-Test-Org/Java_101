package set02;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.[1] For example,
 * the word anagram itself can be rearranged into nag a ram, also the word binary into brainy and the word adobe into abode. */

public class QTwo {
    public static void main(String[] args) {
        String first = "deal";
        String second = "lead";

        System.out.println(checkAnagram(first, second));

    }

    static boolean checkAnagram(String first, String second) {

        boolean condition = false;

        if(first.length() == second.length()) {

            List<String> fst = List.of(first);
            List<String> scd = List.of(second);

            for (String n : fst) {
                condition = !scd.contains(n);
            }
        }
        return condition;
    }

}
