package com.injavawetrust.chapter02;

import java.util.ArrayList;
import java.util.List;

public class SubTyping03 {

    public static void main(String[] args) {

        List<Number> nums = new ArrayList<Number>();
        nums.add(2.78);
        nums.add(3.14);

        // List<Integer> ints = nums; // compile-time error
        // List<Number> is not a subtype of List<Integer>
        // List<Integer> is a subtype of Collection<Integer>.
    }
}
