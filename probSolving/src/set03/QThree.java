package set03;

import java.util.ArrayList;
import java.util.List;

/** find factorials of a given number */
public class QThree {
    public static void main(String[] args) {
        var number = 10;

        List<Integer> fac = findFactorials(number);

        System.out.println(fac);
    }

    public static List<Integer> findFactorials(int number) {

        List<Integer> factorials = new ArrayList<>();

        if(number <= 0) {
            throw new RuntimeException("number should be higher than 0");
        }

        factorials.add(1);

        var start = 2;

        while (number != start) {
            if(number % start == 0) {
                factorials.add(start);
                number = number/start;
            } else {
                start++;
            }
        }

        factorials.add(start);

        return factorials;

    }
}
