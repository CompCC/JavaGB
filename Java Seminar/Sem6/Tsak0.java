// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.


import java.util.*;

public class Tsak0 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(List.of(480, 6, 1, 2, 3, 2, 4, 480, 6, 3));
        System.out.println(hashSet);
        
        Set<Integer> linkedhashSet = new LinkedHashSet<>();
        linkedhashSet.addAll(List.of(480, 6, 1, 2, 3, 2, 4, 480, 6, 3));
        System.out.println(linkedhashSet);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(List.of(480, 6, 1, 2, 3, 2, 4, 480, 6, 3));
        System.out.println(treeSet);
    }

}