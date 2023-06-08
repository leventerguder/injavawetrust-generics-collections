package com.injavawetrust.chapter02;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GetAndPutPrinciple01 {

    /*
    The Get and Put Principle: use an extends wildcard when you only get values out of a structure,
    use a super wildcard when you only put values into a structure,
    and don’t use a wildcard when you both get and put.
     */

    // public static <T> void copy(List<? super T> dest, List<? extends T> src)
    /*
    The method gets values out of the source src, so it is declared with an extends wildcard,
    and it puts values into the destination dst, so it is declared with a super wildcard.
     */

    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for (Number num : nums)
            s += num.doubleValue();
        return s;
    }

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(2.78, 3.14);
        List<Number> nums = Arrays.<Number>asList(1, 2, 2.78, 3.14);

        System.out.println(sum(ints));
        System.out.println(sum(doubles));
        System.out.println(sum(nums));
    }
}
