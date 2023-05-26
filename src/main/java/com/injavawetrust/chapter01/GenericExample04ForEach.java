package com.injavawetrust.chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GenericExample04ForEach {

    public static void main(String[] args) {

        foreach();

        iterator();

        array();

        List<Double> numbs = new ArrayList<>();
        numbs.add(1.1);
        numbs.add(-1.5);
        numbs.add(-0.1);
        numbs.add(5.5);

        removeNegative(numbs);
        System.out.println(numbs);
    }

    private static void iterator() {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int s = 0;
        for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ) {
            int n = it.next();
            s += n;
        }
        System.out.println(s);
    }

    private static void foreach() {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        System.out.println(s);
    }

    public static void array() {

        int[] a = {1, 2, 3};
        int s = 0;
        for (int n : a) {
            s += n;
        }
        System.out.println(s);
    }


    public static void removeNegative(List<Double> v) {
        for (Iterator<Double> it = v.iterator(); it.hasNext(); ) {
            if (it.next() < 0) it.remove();
        }
    }
}
