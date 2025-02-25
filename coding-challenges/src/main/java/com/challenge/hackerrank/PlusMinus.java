package com.challenge.hackerrank;

import java.util.ArrayList;
import java.util.List;

// Given an array of integers,
// calculate the ratios of its elements that are positive, negative, and zero.
// Print the decimal value of each fraction on a new line with  places after the decimal.
public class PlusMinus {
    public static void plusMinus(List<Integer> arr,int n){
       int pos=0;
       int neg=0;
       int zeros=0;

       for(int i=0;i<n;i++){
           if(arr.get(i) >0){
               pos++;
           }else if(arr.get(i)<0){
               neg++;
           }else{
               zeros++;
           }
       }

        System.out.println((double)pos/n);
        System.out.println((double)neg/n );
        System.out.println((double)zeros/n);
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(-1);
        plusMinus(list,list.size());
    }
}
