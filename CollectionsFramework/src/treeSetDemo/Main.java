package treeSetDemo;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(3);
        System.out.println(treeSet);
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
    }
}
