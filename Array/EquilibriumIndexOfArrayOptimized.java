/**
 * Equilibrium index of an array
 * Problem Description
 *
 * You are given an array A of integers of size N.
 *
 * Your task is to find the equilibrium index of the given array
 *
 * Equilibrium index of an array is an index such that the sum of
 * elements at lower indexes is equal to the sum of elements at higher indexes.
 *
 * NOTE:
 *
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 *
 * Problem Constraints
 * 1<=N<=10e5
 * -10e5<=A[i]<=10e5
 *
 *
 * Input Format
 * First arugment contains an array A .
 *
 *
 * Output Format
 * Return the equilibrium index of the given array. If no such index is found then return -1.
 *
 *
 * Example Input
 * Input 1:
 * A=[-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 *
 * A=[1,2,3]
 *
 *
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 *
 * -1
 *
 * */

/*O(n) solution with O(1) space*/
package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndexOfArrayOptimized {

    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ) );
        System.out.println ( solve ( list ) );
    }

    public static int solve(ArrayList < Integer > A) {
        int sum=0;
        for(int ele:A){
            sum+=ele;
        }
        int left_sum=0;
        int rightSum;
        int count=0;
        for(int i=0;i<A.size ();i++){
            left_sum=left_sum+A.get ( i );
            rightSum=sum-left_sum+A.get ( i );

            if(left_sum==rightSum){
                count++;
            }
        }
    return  count;
    }
}
