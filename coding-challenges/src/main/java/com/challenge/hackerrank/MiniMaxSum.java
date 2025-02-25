package com.challenge.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static  void findMinMaxValue(List<Integer> list){
        long total_sum=list.stream().mapToLong(Integer::longValue).sum();
        long minValue= Collections.min(list);
        long maxValue=Collections.max(list);
        long max_sum=total_sum-minValue;
        long min_sum=total_sum-maxValue;
        System.out.println(min_sum+", "+max_sum);
    }

    public static void findMaxAndMinValue(List<Integer> list){
        long total_sum=0;
        for(int i=0;i<list.size();i++){
            total_sum +=list.get(i);
        }

        long minValue=Collections.min(list);
        long maxValue=Collections.max(list);

        long max_sum=total_sum-minValue;
        long min_sum=total_sum-maxValue;
        System.out.println(min_sum+", "+max_sum);
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

    findMinMaxValue(list);
    findMaxAndMinValue(list);
    }
}
