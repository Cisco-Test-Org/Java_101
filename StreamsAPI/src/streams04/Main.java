package streams04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1,2,3,4,5,6,7,8,9);
        // even numbers
        List<Integer> evenList = numbers.stream().filter(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(Arrays.toString(evenList.toArray()));
    }

}
