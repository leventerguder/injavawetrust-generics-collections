package com.injavawetrust.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GetAndPutPrinciple02 {


    /*
    Whenever you use the add method, you put values into a structure, so use a super wildcard.
    */
    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++)
            ints.add(i);
    }

    public static void main(String[] args) {


        List<Integer> ints = new ArrayList<Integer>();
        count(ints, 5);

        List<Number> nums = new ArrayList<Number>();
        count(nums, 5);
        nums.add(5.0);

        List<Object> objs = new ArrayList<Object>();
        count(objs, 5);
        objs.add("five");

        System.out.println(ints);
        System.out.println(nums);
        System.out.println(objs);
    }
}
