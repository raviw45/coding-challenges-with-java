package com.challenge.yt;

public class FindArrayMedian {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        double median =findMedian(arr);
        System.out.println(median);
    }

    public static double findMedian(int[] arr){
        int n=arr.length;

        if(n%2==1){
            return arr[n/2];
        }else{
            return (arr[(n-1)/2]+arr[n/2])/2.0;
        }
    }
}
