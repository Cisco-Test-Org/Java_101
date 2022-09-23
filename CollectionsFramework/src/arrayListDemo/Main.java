package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Go");
        list.add("Python");
        list.add("JavaScript");
        list.add("Rust");

        System.out.println(list.get(2));
        System.out.println(list.indexOf("Python"));

        //Traversing list through Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Traversing list through forEach
        for (String lang : list) {
            System.out.println(lang);
        }

        //Sorting the list
        Collections.sort(list);
        System.out.println(list);
    }
}
