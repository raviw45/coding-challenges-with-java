package com.challenge.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings,List<String> queries){
        Map<String,Long> frequencyMap=strings.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
        return queries.stream().map((query)->frequencyMap.getOrDefault(query,0L).intValue()).collect(Collectors.toList());
    }

    public static List<Integer> matchingStringsAnother(List<String> strings,List<String> queries){
        int nStrings=strings.size();
        int nQueries=queries.size();
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<nQueries;i++){
            int count=0;
            for(int j=0;j<nStrings;j++){
               if(queries.get(i).equals(strings.get(j))){
                   count++;
               }else continue;
            }
            result.add(count);
        }

        return  result;
    }
    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        List<String> queries=new ArrayList<>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

//        List<Integer> result=matchingStrings(strings,queries);
        List<Integer> result=matchingStringsAnother(strings,queries);
        result.stream().forEach(System.out::println);
    }
}
