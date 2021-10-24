/**
 * Observation is suppose an array 1,2,3,4,5
 *
 * What is the contribution of 2 in all the sub array: It is left subarray from 2 * right subarray from 2 = 2*4 = 8
 * So if we count the contribution of each element in all subarray formed from array we will get sum of all subarray.
 * in O(n) times
 *
 *
 * */


package com.company.DSAlgo;


import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllSubArray_OptimizedSolution {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 4) );
        System.out.println ( solve ( list ) );
    }

    public static long solve(ArrayList < Integer > A) {
        long sum=0;
        long left,right;
        long totalContribution;
        for(int i=0;i<A.size();i++){
            left=i+1;right=A.size ()-i;
            totalContribution= left*right;
            sum=sum+(totalContribution*A.get ( i ));
        }
        return  sum;
    }
}
