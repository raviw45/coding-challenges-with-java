package com.challenge.yt;

public class PrimeNumberCountFromOneToHundred {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        int count=0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.printf("Prime numbers from range %d to %d are: %d",start,end,count);
    }

    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
}
