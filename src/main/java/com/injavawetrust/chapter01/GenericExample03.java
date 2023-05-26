package com.injavawetrust.chapter01;

import java.util.List;

public class GenericExample03 {


    public static int sum(List<Integer> ints) {
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        return s;
    }

    // Why does the argument have type List<Integer> and not List<int>?
    // Because type parameters must always be bound to reference types, not primitive types.
    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) {
            s += n;
        }
        return s;
    }


}
