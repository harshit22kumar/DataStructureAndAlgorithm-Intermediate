/**
 * Kadane's Algo
 * */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumContiguousSubArray_optimized {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ) );
        System.out.println ( maxSubArray ( list ) );
    }
    public static int maxSubArray(final List <Integer> A) {
        int cur_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            cur_sum+=A.get(i);
            max_sum=Math.max(max_sum,cur_sum);
            if(cur_sum<0){
                cur_sum=0;
            }
        }
        return max_sum;
    }

}
