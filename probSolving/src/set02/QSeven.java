package set02;

import java.util.HashSet;
import java.util.Set;

/**
 * Pangrams
 * A pangram is a sentence that contains all 26 letters of the English alphabet.
 */

public class QSeven {
    public static void main(String[] args) {

        var string = "The quick brown fox jumps over the lazy dog";
        char[] stringArray = string.toLowerCase().replaceAll(" ", "").toCharArray();
        Set<Character> set1 = new HashSet<>();
        for (char c : stringArray) {
            set1.add(c);
        }

        Set<Character> set2 = new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            set2.add(i);
        }

        System.out.println(set1.equals(set2) ? "Pangram" : "Not a Pangram");

    }
}
