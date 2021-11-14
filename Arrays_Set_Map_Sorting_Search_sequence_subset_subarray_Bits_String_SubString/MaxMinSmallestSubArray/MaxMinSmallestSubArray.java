/**
 * Closest MinMax
 * Problem Description
 *
 * Given an array A. Find the size of the smallest subarray such that it contains atleast one 
* occurrence of the maximum value of the array
 *
 * and atleast one occurrence of the minimum value of the array.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 2000
 *
 *
 *
 * Input Format
 * First and only argument is vector A
 *
 *
 *
 * Output Format
 * Return the length of the smallest subarray which has atleast one occurrence of minimum and maximum element of the array
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 3]
 * Input 2:
 *
 * A = [2]
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  1
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Only choice is to take both elements.
 * Explanation 2:
 *
 *  Take the whole array.
 *
 *
 * */

package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinSmallestSubArray {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 2,2,6,4,5,1,5,2,6,4,1) );
        System.out.println ( solve ( list ) );
    }

    public static int solve(ArrayList <Integer> A) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int ele:A){
            if(ele<min){
                min=ele;
            }
            if(ele>max){
                max=ele;
            }
        }
        if(min==max){
            return 1;
        }
        int ans=A.size();
        int maxi=A.size()*2;
        int mini=A.size()*2;
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i)==max){
                ans=Math.min(ans,mini-i+1);
                maxi=i;
            }else if(A.get(i)==min){
                ans=Math.min(ans,maxi-i+1);
                mini=i;
            }
        }
        return ans;
    }
}
