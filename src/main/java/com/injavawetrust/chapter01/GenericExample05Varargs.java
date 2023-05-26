package com.injavawetrust.chapter01;

import java.util.ArrayList;
import java.util.List;

public class GenericExample05Varargs {


    public static void main(String[] args) {

        List<Integer> ints = toList(new Integer[]{1, 2, 3});
        List<String> words = toList(new String[]{"hello", "world"});

        System.out.println(ints);
        System.out.println(words);


        List<Integer> ints2 = toListV2(new Integer[]{1, 2, 3});
        List<String> words2 = toListV2(new String[]{"hello", "world"});

        System.out.println(ints2);
        System.out.println(words2);


        List<Integer> ints3 = new ArrayList<Integer>();
        addAll(ints3, 1, 2);
        addAll(ints3, new Integer[]{3, 4});
        System.out.println(ints3.toString().equals("[1, 2, 3, 4]"));


        List<Integer> ints4 = GenericExample05Varargs.<Integer>toList(new Integer[]{1, 2, 3});
        List<Object> objs4 = GenericExample05Varargs.<Object>toList(new Object[]{1, "one", 'a'});


        // List<Integer> ints5 = <Integer>toList(); // compile-time error

    }

    public static <T> List<T> toList(T[] arr) {
        List<T> list = new ArrayList<T>();
        for (T elt : arr) list.add(elt);
        return list;
    }

    public static <T> List<T> toListV2(T... arr) {
        List<T> list = new ArrayList<T>();
        for (T elt : arr) list.add(elt);
        return list;
    }

    public static <T> void addAll(List<T> list, T... arr) {
        for (T elt : arr) list.add(elt);
    }
}
