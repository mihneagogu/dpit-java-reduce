package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        sumEx();
        productEx();
        wrapSumEx();
    }

    // Acc de la accumulator
    private static void wrapSumEx() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4);

        List<IntWrapper> nexts = ints.stream().map(IntWrapper::new).collect(Collectors.toList());
        IntWrapper wrapSum = nexts.stream().reduce(new IntWrapper(0), (acc, wrap) -> {
            System.out.println("acc: " + acc + " | wrap: " + wrap);
            return new IntWrapper(acc.getInner() + wrap.getInner());
        });
        System.out.println(wrapSum + "\n");

    }

    // Acc de la accumulator
    private static void sumEx() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer sum = ints.stream().reduce(0, (acc, newVal) -> {
            System.out.println("acc: " + acc + " | newVal: " + newVal);
            return acc + newVal;
        });
        System.out.println(sum + "\n");
    }

    // Acc de la accumulator
    private static void productEx() {
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6);

        Integer product = ints.stream().reduce(1, (acc, newVal) -> {
            System.out.println("acc: " + acc + " | newVal: " + newVal);
            return acc * newVal;
        });
        System.out.println(product + "\n");

    }

    private static int sumIntList(List<Integer> ints) {
        // Integer::sum e de fapt functia noastra (a, b) -> a + b
        return ints.stream().reduce(0, Integer::sum);
    }

    private static int productIntList(List<Integer> ints) {
        return ints.stream().reduce(0, (acc, val) -> acc * val);
    }

}
