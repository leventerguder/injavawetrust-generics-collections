package com.injavawetrust.chapter01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GenericExample01 {

    public static void main(String[] args) {

        withGenerics();
        beforeGenerics();
        withArray();
    }

    private static void withGenerics() {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        int s = 0;
        for (int n : ints) {
            s += n;
        }

        System.out.println(s);
    }

    private static void beforeGenerics() {

        List ints = Arrays.asList(new Integer[]{
                new Integer(1), new Integer(2), new Integer(3)
        });
        int s = 0;
        for (Iterator it = ints.iterator(); it.hasNext(); ) {
            int n = ((Integer) it.next()).intValue();
            s += n;
        }

        System.out.println(s);
    }

    private static void withArray() {

        int[] ints = new int[]{1, 2, 3};
        int s = 0;
        for (int i = 0; i < ints.length; i++) {
            s += ints[i];
        }

        System.out.println(s);
    }
}
