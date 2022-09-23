package streams07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "h", "e", "l", "l", "o");
        String string = list.stream().collect(Collectors.joining("-"));
        System.out.println(string);
    }

}
