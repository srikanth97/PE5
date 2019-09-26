package com.stackroute;

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<String>();
        set.add("Harry");
        set.add("Olive");
        set.add("Alice");
        set.add("Blunto");
        set.add("Eugenge");
        System.out.println("TreeSet:- " +set);

        List<String> list = convertSetToList(set);

        System.out.println("ArrayList:- " +list);

    }

    public static <T> List<T> convertSetToList(Set<T> set){
        List<T> list = new ArrayList<T>();
        for (T t:set){
            list.add(t);
        }
        return list;
    }
}
