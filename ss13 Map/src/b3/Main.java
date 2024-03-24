package b3;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>( Comparator.reverseOrder());
        for (int i = 0; i < 100; i++) {
            treeMap.put((int) (Math.random() * 100), 0);
        }
        System.out.println(treeMap);
    }
}