/**
 * Max Sum Contiguous Subarray
 * Problem Description
 *
 * Find the contiguous subarray within an array, A of length N which has the largest sum.
 *
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumContiguousSubArray {
    public static void main(String []args){
        List<Integer> list = new ArrayList<>(Arrays.asList(3,7,90,20,10));
        System.out.println(maxSubArray(list));
    }

    public static int maxSubArray(final List<Integer> A) {
        int sum;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            sum=0;
            for(int j=i;j<A.size();j++){
                sum=sum+A.get(j);
                System.out.println(sum);
                if(max<sum){
                    max=sum;
                }
            }
        }
        return max;
    }
}
