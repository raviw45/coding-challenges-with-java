package com.challenge.yt;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int number=sc.nextInt();
        if(isPalindrome(number)){
            System.out.println("number is a palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }

    public static boolean isPalindrome(int number){
        String original=String.valueOf(number);
        String reversed= IntStream
                .rangeClosed(1,original.length())
                .mapToObj(i->original.charAt(original.length()-i))
                .collect(StringBuilder::new,StringBuilder::append,StringBuilder::append)
                .toString();
        return original.equals(reversed);
    }
}
