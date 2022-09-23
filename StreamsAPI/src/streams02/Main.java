package streams02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Random random = new Random();
//        random.ints().limit(10).forEach(System.out::println);

        List<String> languages = new ArrayList<>();
        Collections.addAll(languages, "Java", "Go", "Python");
        languages.stream().forEach(System.out::println);
    }

}
