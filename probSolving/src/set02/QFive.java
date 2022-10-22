package set02;

import java.util.Arrays;

/** Word search */

public class QFive {
    public static void main(String[] args) {
        var string = "Java is a popular programming language";

        var find = "popular";

        var status = false;

        String[] stringArray = string.split(" ");

        for (String item : stringArray) {
            if(item.equals(find)) {
                status = true;
                break;
            }
        }

        System.out.println("Contains :" + status);
    }
}
