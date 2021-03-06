/**
 * Given an array a[] of N positive and negative numbers.
 * Find if there is a subarray (of size at-least one) with 0 sum.
 * subArraywithAtleastSizeOnewithSumZero
 * 
 */

#include<iostream>
/*
Sub-array with 0 sum
Problem Description

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1 else return 0.



Problem Constraints
1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return whether the given array contains a subarray with a sum equal to 0.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.
*/



bool findSubArraySumToZero(vector<int> &arr)
{
   HashSet<Long> set=new HashSet<>();
        int ans=0;
        long pre=0;
        for(int i=0;i<A.size();i++){
           pre=pre+A.get(i);
           if(set.contains(pre)){
                ans=1;
                break;
            }else{
                set.add(pre);
            }
            if(pre==0){
               ans=1;
               break; 
            }
        }
        return ans;
}