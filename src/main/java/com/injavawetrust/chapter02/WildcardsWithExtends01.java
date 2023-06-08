package com.injavawetrust.chapter02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsWithExtends01 {

    public static void main(String[] args) {

        List<Number> nums = new ArrayList<Number>();
        List<Integer> ints = Arrays.asList(1, 2);
        List<Double> dbls = Arrays.asList(2.78, 3.14);

        // public boolean addAll(Collection<? extends E> c);

        nums.addAll(ints);
        nums.addAll(dbls);

        /*
        The first call is permitted because nums has type List<Number>, which is a subtype of Collection<Number>,
        and ints has type List<Integer>, which is a subtype of Collection<? extends Number>.

         */
    }
}
