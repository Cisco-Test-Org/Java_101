package streams01;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Java", "Go", "Python");
        Stream<int[]> stream2 = Stream.of(new int[]{1, 2, 3, 4, 5});
    }
}
