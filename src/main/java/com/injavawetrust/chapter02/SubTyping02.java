package com.injavawetrust.chapter02;

import java.util.ArrayList;
import java.util.List;

public class SubTyping02 {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);

       // List<Number> nums = ints; // compile-time error nums.add(3.14);

        // List<Integer> is not a subtype of List<Number>
    }

}
