package hashMapDemo;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Go");
        map.put(3, "Python");
        map.put(4, "Php");
        map.put(4, "Rust");

        System.out.println(map);

        System.out.println(map.get(1));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
