/*
* Problem Description

Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from the array A.



Problem Constraints
1 <= N <= 106

-106 <= A[i] <= 106



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the length of the longest set of consecutive elements from the array A.



Example Input
Input 1:

A = [100, 4, 200, 1, 3, 2]
Input 2:

A = [2, 1]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].
Explanation 2:

 The set of consecutive elements will be [1, 2].
*
*
* */



package com.company.DSAlgo;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 5,6,4,2,1,3,4,5,6,0,-3,-2,-1 ) );
        System.out.println ( longestConsecutive ( list ) );
    }


    public static int longestConsecutive(final List <Integer> A) {
        HashSet <Integer> set = new HashSet <> ();
        for(int ele:A){
            set.add(ele);
        }
        int ans=0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                ans=iterateAndFindSequence(ele+1,ans,set);
            }
        }
        return ans;
    }

    public static int iterateAndFindSequence(int ele,int ans,HashSet<Integer> set){
        int count=1;
        int i=0;
        while(i<set.size ()){
            if(set.contains ( ele )){
                ele++;
                count++;
                i++;
            }else {
                break;
            }
        }
        return Math.max(ans,count);
    }
}
