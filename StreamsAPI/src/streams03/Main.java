package streams03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1,2,3,4,5);
        numbers.stream().map(i -> i * i).forEach(System.out::println);

    }

}
