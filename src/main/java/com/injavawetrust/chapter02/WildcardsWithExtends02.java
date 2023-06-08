package com.injavawetrust.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsWithExtends02 {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        // nums.add(3.14); // compile-time error

    }
}
