package com.injavawetrust.chapter01;

import java.util.ArrayList;
import java.util.List;

public class GenericExample02 {

    public static void main(String[] args) {

        withGeneric();
        withoutGeneric();

    }

    // Cast-iron guarantee: the implicit casts added by the compilation of generics never fail.
    private static void withGeneric() {
        List<String> words = new ArrayList<String>();
        words.add("Hello ");
        words.add("world!");
        String s = words.get(0) + words.get(1);
        System.out.println(s);
    }

    private static void withoutGeneric() {
        List words = new ArrayList();
        words.add("Hello ");
        words.add("world!");
        String s = ((String) words.get(0)) + ((String) words.get(1));
        System.out.println(s);
    }
    /*
    Without generics, the type parameters are omitted, but you must explicitly cast whenever an element is extracted from the list.
    In fact, the bytecode compiled from the two sources above will be identical.
    . We say that generics are implemented by erasure because the types List<Integer>, List<String>,
    and List<List<String>> are all represented at run-time by the same type, List.
     */
}
