package com.challenge.yt;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n=8;

        int firstNum=0;
        int secondNum=1;

        for(int i=1;i<=n;i++){
            System.out.print(firstNum+", ");
            int nextNumber=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNumber;
        }

    }
}
