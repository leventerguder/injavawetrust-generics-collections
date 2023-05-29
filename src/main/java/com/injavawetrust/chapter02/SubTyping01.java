package com.injavawetrust.chapter02;

import java.util.ArrayList;
import java.util.List;

public class SubTyping01 {

    public static void main(String[] args) {

        List<Number> nums = new ArrayList<Number>();
        nums.add(2);
        nums.add(3.14);

        // We may add an integer or a double to it, because Integer and Double are subtypes of Number.

        System.out.println(nums);
    }
}
