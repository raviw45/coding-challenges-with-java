package com.challenge.yt;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOccurrenceInString {
    public static void main(String[] args) {
        String str="Hello java welcome to the java program";
        System.out.println(Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));;
    }
}
