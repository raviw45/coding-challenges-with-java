package com.challenge.yt;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsInString {
    public static void main(String[] args) {
        String str="Hello java welcome to java";
        long count=Arrays.stream(str.split(" ")).count();
        System.out.println(count);
//        Occurrence of the word in string
//        System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));;
    }
}
