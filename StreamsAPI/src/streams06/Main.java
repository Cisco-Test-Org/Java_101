package streams06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3,5,1,2,6,9,8);
        numbers.stream().sorted().forEach(System.out::println);

    }

}
