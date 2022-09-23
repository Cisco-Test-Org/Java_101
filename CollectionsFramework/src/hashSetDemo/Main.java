package hashSetDemo;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(5);
        numSet.add(2);
        numSet.add(4);
        numSet.add(5);
        System.out.println(numSet);


        Set<String> stringSet = new HashSet<>();
        stringSet.add("Java");
        stringSet.add("Go");
        stringSet.add("Python");
        stringSet.add("Go");
        System.out.println(stringSet);

        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat(1, "Tutu"));
        catSet.add(new Cat(2, "Kitty"));
        catSet.add(new Cat(3, "Liz"));
        catSet.add(new Cat(2, "Kitty"));
        catSet.add(null);
        catSet.add(null);
        System.out.println(catSet);
    }
}
