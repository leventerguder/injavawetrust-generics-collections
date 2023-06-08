package com.injavawetrust.chapter02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WildcardsWithSuper01 {

    /*

    The quizzical phrase ? super T means that the destination list
    may have elements of any type that is a supertype of T,
    just as the source list may have elements of any type that is a subtype of T.
     */
    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }

    public static void main(String[] args) {

        List<Object> objs = Arrays.<Object>asList(2, 3.14, "four");
        List<Integer> ints = Arrays.asList(5, 6);
        Collections.copy(objs, ints);

        Collections.copy(objs, ints);
        Collections.<Object>copy(objs, ints);
        Collections.<Number>copy(objs, ints);
        Collections.<Integer>copy(objs, ints);

        System.out.println(objs);
        System.out.println(ints);
    }

}
