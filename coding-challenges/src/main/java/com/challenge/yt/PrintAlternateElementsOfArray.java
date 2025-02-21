package com.challenge.yt;

import java.util.stream.IntStream;
//WAP to print the alternate number in an array
public class PrintAlternateElementsOfArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        IntStream.range(0,array.length).filter(x->x%2==0).map(i->array[i]).forEach(System.out::println);
    }
}
