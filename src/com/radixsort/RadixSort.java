package com.radixsort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    public static void Main(String[] args){
        List<Integer> array = new ArrayList<Integer>();
        array.add(102);
        array.add(101);
        array.add(205);
        array.add(389);
        array.add(123);
        array.add(542);
        array.add(462);
        array.add(546);
        array.add(355);
        array.add(426);
        var rad = new Radix();
        rad.sort(array);
    }
}
