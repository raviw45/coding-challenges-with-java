package com.challenge.hackerrank;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {
    public static int lonelyInteger(List<Integer> a){
        Set<Integer> set=new HashSet<>();
        for(int A:a){
            if(!set.contains(A)){
                set.add(A);
            }else{
                set.remove(A);
            }
        }
        return set.toArray(new Integer[1])[0];
    }
    public static void main(String[] args) {
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
       int result=lonelyInteger(a);
        System.out.println(result);
    }
}
