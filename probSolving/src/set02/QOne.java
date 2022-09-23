package set02;

import java.util.Arrays;

/** reverse a string */

public class QOne {
    public static void main(String[] args) {
        var string = "Hello World";
        reverseOne(string);
        reverseTwo(string);
    }

    static void reverseOne(String string) {
        StringBuilder sb = new StringBuilder(string);
        System.out.println(sb.reverse());
    }

    static void reverseTwo(String string) {
        String reversed = "";
        for (int i = string.length() -1 ; i >= 0; i--) {
            reversed = reversed + string.charAt(i);
        }
        System.out.println(reversed);
    }
}
