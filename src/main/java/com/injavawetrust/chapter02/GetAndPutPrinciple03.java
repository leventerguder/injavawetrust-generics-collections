package com.injavawetrust.chapter02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GetAndPutPrinciple03 {


    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums)
            s += num.doubleValue();
        return s;
    }

    public static void count(Collection<? super Integer> ints, int n) {
        for (int i = 0; i < n; i++)
            ints.add(i);
    }


    /*
    Whenever you both put values into and get values out of the same structure, you should
    not use a wildcard.
     */
    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }

    // double sumCount(Collection<? extends Number super Integer> coll, int n) {}
    // not legal Java!


    public static void main(String[] args) {


        List<Number> nums = new ArrayList<Number>();
        double sum = sumCount(nums, 5);

        System.out.println(sum);


        /*
        The call to sum is fine, because it gets values from the list, but the call to add is not,
        because it puts a value into the list.
        This is just as well, since otherwise we could add a double to a list of integers!
         */

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);

        List<? extends Number> nums2 = ints;
        double dbl = sum(nums); // ok
        // nums2.add(3.14); // compile-time error
    }
}
