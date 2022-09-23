package streams08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3,5,1,2,6,9,8, 5);
        List<Integer> list = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.get(list.size() - 1));
    }

}
