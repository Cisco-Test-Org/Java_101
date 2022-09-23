package streams05;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);
    }

}
