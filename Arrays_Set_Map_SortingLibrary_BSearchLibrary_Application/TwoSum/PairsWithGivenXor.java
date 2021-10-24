/*
* Problem Description

Given an 1D integer array A containing N distinct integers.

Find the number of unique pairs of integers in the array whose XOR is equal to B.

NOTE:

Pair (a, b) and (b, a) is considered to be same and should be counted once.


Problem Constraints
1 <= N <= 105

1 <= A[i], B <= 107



Input Format
First argument is an 1D integer array A.

Second argument is an integer B.



Output Format
Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.



Example Input
Input 1:

 A = [5, 4, 10, 15, 7, 6]
 B = 5
Input 2:

 A = [3, 6, 8, 10, 15, 50]
 B = 5


Example Output
Output 1:

 1
Output 2:

 2


Example Explanation
Explanation 1:

 (10 ^ 15) = 5
Explanation 2:

 (3 ^ 6) = 5 and (10 ^ 15) = 5
* */


package com.company.DSAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairsWithGivenXor {
    public static void main(String[] args) {
        ArrayList < Integer > list = new ArrayList <> ( Arrays.asList ( 1, 2, 3, 7, 1, 2, 3 ));
        System.out.println ( solve ( list ,3) );
    }

        public static int solve(ArrayList <Integer> A, int B) {
            HashMap <Integer,Integer> hm=new HashMap<>();
            int ans=0;
            for(int ele:A){
                if(hm.containsKey(ele)){
                    hm.put(ele,hm.get(ele)+1);
                }else{
                    hm.put(ele,1);
                }
            }
            int target;
            for(int ele:A){
                target=ele^B;
                if(ele!=target){
                    if(hm.containsKey(target)){
                        ans++;
                    }
                }else{
                    if(hm.get(target)>=2){
                        ans++;
                    }
                }
            }
            return ans/2;
        }
    }

