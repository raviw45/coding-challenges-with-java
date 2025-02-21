package com.challenge.yt;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        String str1="Race";
        String str2="care";

        if(isAnagram(str1,str2)){
            System.out.println("Given strings are anagram");
        }else{
            System.out.println("Given Strings are not anagram");
        }
    }

    public static boolean isAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length() != str2.length()) return false;

        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}
